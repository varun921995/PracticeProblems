import java.util.*;

class Server implements Comparable<Server> {
    int id;     // Server ID
    int load;   // Number of assigned requests

    public Server(int id, int load) {
        this.id = id;
        this.load = load;
    }

    @Override
    public int compareTo(Server other) {
        // Compare based on load first, then by server ID
        if (this.load == other.load) {
            return Integer.compare(this.id, other.id);
        }
        return Integer.compare(this.load, other.load);
    }
}

public class Main {
    public static int[] assignRequests(int num_servers, int[] requests) {
        int[] result = new int[requests.length];  // Stores assigned server IDs
        PriorityQueue<Server> minHeap = new PriorityQueue<>();  // Min-Heap

        // Initialize heap with all servers
        for (int i = 0; i < num_servers; i++) {
            minHeap.add(new Server(i, 0));
        }

        // Process each request
        for (int i = 0; i < requests.length; i++) {
            int maxServerId = requests[i];  // Maximum server ID that can be assigned
            List<Server> tempList = new ArrayList<>();

            // Find the valid server with the lowest load
            Server selectedServer = null;
            while (!minHeap.isEmpty()) {
                Server server = minHeap.poll();
                tempList.add(server);

                if (server.id <= maxServerId) {
                    selectedServer = server;
                    break;
                }
            }

            // Restore remaining servers to the heap
            for (Server s : tempList) {
                if (s != selectedServer) {
                    minHeap.add(s);
                }
            }

            if (selectedServer == null) {
                throw new RuntimeException("No valid server found for request " + requests[i]);
            }

            // Assign request to the selected server
            result[i] = selectedServer.id;
            selectedServer.load++; // Increment load

            // Add back the updated server into the heap
            minHeap.add(selectedServer);
        }

        return result;
    }

    public static void main(String[] args) {
        int num_servers = 5;
        int[] requests = {3, 2, 3, 2, 4};

        int[] assignments = assignRequests(num_servers, requests);
        System.out.println(Arrays.toString(assignments));  // Output: [0, 0, 1, 2]
    }
}
