package graphs;

import java.util.*;

public class AdjacencyListAndTraversal {

    // Total number of vertices
    int vertices;

    // Adjacency list
    // Each index stores neighbors of that vertex
    List<List<Integer>> adj;

    // Constructor
    public AdjacencyListAndTraversal(int val) {
    	vertices = val;

        // Create outer list
        adj = new ArrayList<>();

        // Create empty neighbor list for each vertex
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge between u and v
    public void addEdge(int u, int v) {

        // Add v to u's list
        adj.get(u).add(v);

        // Add u to v's list (because undirected graph)
        adj.get(v).add(u);
    }

    // Get all neighbors of vertex u
    public List<Integer> getNeighbors(int u) {
        return adj.get(u);
    }
    
    // -------- DFS --------
    public void dfs(int current, boolean[] visited) {

        visited[current] = true;
        System.out.print(current + " ");

        // Visit all neighbors
        for (int neighbor : adj.get(current)) {

            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }
    
    // -------- BFS --------
    public void bfs(int start) {

        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adj.get(current)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // ----------------- MAIN METHOD -----------------
    public static void main(String[] args) {
        // Create a graph with 5 vertices (0 to 4)
    	AdjacencyListAndTraversal graph = new AdjacencyListAndTraversal(5);

        // Add some edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print adjacency list
        System.out.println("Adjacency List of the graph:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " -> " + graph.getNeighbors(i));
        }
        
        // Perform DFS
        System.out.println("\nDFS Traversal starting from vertex 0:");

        boolean[] visited = new boolean[5];
        graph.dfs(1, visited);
       
        // Perform BFS
        System.out.println("\n\nBFS starting from 0:");
        graph.bfs(1);
        
    }
}
