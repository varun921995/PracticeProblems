import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RateLimiter {

    private final Map<String, Long> clientRequestLimit;
    private final Map<String, Long> clientTimeWindowMs;
    private final Map<String, List<Long>> requestTimestamps;
    private final Map<String, Lock> clientLocks; // To ensure thread-safe access to requestTimestamps

    public RateLimiter() {
        this.clientRequestLimit = new ConcurrentHashMap<>();
        this.clientTimeWindowMs = new ConcurrentHashMap<>();
        this.requestTimestamps = new ConcurrentHashMap<>();
        this.clientLocks = new ConcurrentHashMap<>();
    }

    public void configureRateLimiter(String clientId, long totalRequests, long timeWindowInSeconds) {
        clientRequestLimit.put(clientId, totalRequests);
        clientTimeWindowMs.put(clientId, timeWindowInSeconds * 1000);
        requestTimestamps.putIfAbsent(clientId, new ArrayList<>());
        clientLocks.putIfAbsent(clientId, new ReentrantLock());
    }

    public boolean allowRequest(String clientId) {
        if (!clientRequestLimit.containsKey(clientId)) {
            System.out.println("Client " + clientId + " does not exist");
            return false;
        }

        long limit = clientRequestLimit.get(clientId);
        long windowMs = clientTimeWindowMs.get(clientId);
        long currentTime = System.currentTimeMillis();

        Lock lock = clientLocks.get(clientId);
        lock.lock();
        try {
            List<Long> timestamps = requestTimestamps.get(clientId);

            // Remove timestamps older than the current time window
            timestamps.removeIf(timestamp -> timestamp < currentTime - windowMs);

            // Check if the number of requests within the window is less than the limit
            if (timestamps.size() < limit) {
                timestamps.add(currentTime);
                return true;
            } else {
                return false;
            }
        } finally {
            lock.unlock();
        }
    }
}
