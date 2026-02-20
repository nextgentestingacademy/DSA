package graphs;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int V = 5;
        int[][] graph = new int[V][V];

        // Add edges
        graph[0][1] = 1; 
        graph[0][4] = 1; 
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[1][3] = 1;
        graph[1][4] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[3][2] = 1;
        graph[3][4] = 1; 
        graph[4][0] = 1;
        graph[4][1] = 1;
        graph[4][3] = 1;
        
        // Print adjacency matrix
        //outer for loop will iterate the rows
        for (int i = 0; i < V; i++) {
        	//inner for loop will iterate the columns
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}