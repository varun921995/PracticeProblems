import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class DFSGraph{
    
    private Map<Integer, List<Integer>> adjList;

    public DFSGraph() {
        adjList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source); // For an undirected graph
    }

    private void dfsUtil(int node, Set<Integer> visited) {
        // Mark the current node as visited
        visited.add(node);
        System.out.print(node + " ");

        // Recur for all adjacent vertices
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void dfs(int startNode) {
        Set<Integer> visited = new HashSet<>();
        dfsUtil(startNode, visited);
    }
 }
