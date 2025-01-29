/*

Problem: Load Balancer Request Distribution
You are designing a load balancer that distributes incoming HTTP requests to a set of backend servers.
The load balancer should implement a round-robin strategy with dynamic server addition and removal.

Problem Statement
Implement a LoadBalancer class that supports the following operations:

addServer(String serverId)

Adds a new backend server identified by serverId.
removeServer(String serverId)

Removes an existing backend server. If the server does not exist, do nothing.
getNextServer() -> String

Returns the serverId of the next server to handle the request in a round-robin fashion.
 */


public class Main {
    public static void main(String[] args) {
        LoadBalancer lb = new LoadBalancer();
        lb.addServer("A");
        lb.addServer("B");
        lb.addServer("C");
        System.out.println(lb.getNextServer()); // "A"
        System.out.println(lb.getNextServer()); // "B"
        lb.removeServer("A"); // "A"
        lb.removeServer("B");
        System.out.println(lb.getNextServer()); // "C"
        System.out.println(lb.getNextServer()); // "A"
        System.out.println(lb.getNextServer());
    }
}