import java.util.LinkedList;

public class Main {

    private int numVertices;
    private LinkedList<Integer>[] adjVertices;

    Main(int numVertices){
        this.numVertices = numVertices;
        adjVertices = new LinkedList[numVertices];
        for (int i = 0; i < numVertices ; i++) {
            adjVertices[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adjVertices[v].add(w);
    }

    public void BFS(int startVertex){
         boolean[] visited = new boolean[numVertices];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.println("vertex : " +vertex);
            for (int i : adjVertices[vertex]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }


    public static void main(String[] args) {

        Main graph = new Main(6);  // Creating a graph with 6 vertices

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("BFS traversal starting from vertex 0:");
        graph.BFS(0);  // Perform BFS starting from vertex 0

    }
}