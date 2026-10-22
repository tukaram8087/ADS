package collections.graph;

public class Program {
    public static void main(String[] args) {
        // --- 1. Test AdjListGraph ---
        AdjListGraph listGraph = new AdjListGraph(5, false);
        
        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 4);
        listGraph.addEdge(1, 2);
        listGraph.addEdge(1, 3);
        listGraph.addEdge(1, 4);
        listGraph.addEdge(2, 3);
        listGraph.addEdge(3, 4);

        System.out.print("DFS start from vertex 0: ");
        listGraph.printDFS(0);

        System.out.print("BFS start from vertex 0: ");
        listGraph.printBFS(0);

        System.out.println("isConnected:" + listGraph.isConnected());
        System.out.println("connectedComponentCount:" + listGraph.connectedComponentCount());


        System.out.println("AdjacencyMatrix");
        AdjacencyMatrix matrixGraph = new AdjacencyMatrix(5, false);
        
        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(0, 4);
        matrixGraph.addEdge(1, 2);
        matrixGraph.addEdge(1, 3);
        matrixGraph.addEdge(1, 4);
        matrixGraph.addEdge(2, 3);
        matrixGraph.addEdge(3, 4);

        System.out.print("DFS starting from vertex 0: ");
        matrixGraph.printDFS(0);

        System.out.println("AdjacencyMatrix isConnected: " + matrixGraph.isConnected());
        System.out.println("AdjacencyMatrix connectedComponentCount: " + matrixGraph.connectedComponentCount());
        
    
}}