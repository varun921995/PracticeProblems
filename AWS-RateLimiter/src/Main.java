public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World!");
        RateLimiter rl = new RateLimiter();
        rl.configureRateLimiter("client1",2L, 360L);// clientId, numRequest, timeWindowInSeconds
        for (int i = 1; i <= 7; i++) {
            System.out.println("Request " + i + " allowed: " + rl.allowRequest("client1"));
            Thread.sleep(500); // Simulate requests arriving every 1 second
        }
    }


}