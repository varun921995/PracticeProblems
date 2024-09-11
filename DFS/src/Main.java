import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        DFSGraph graph = new DFSGraph();

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        // Perform DFS starting from node 0
        System.out.println("DFS traversal starting from node 0:");
        graph.dfs(0);
    }
}