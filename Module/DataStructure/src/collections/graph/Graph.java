package collections.graph;

public interface Graph {
	void addEdge(int u, int v);
	void addEdge(int u, int v, int w);
	void printBFS(int startVertex);
	void printDFS(int startVertex);
	void dijkstraShortestPath(int startVertex, int destVertex);

}
