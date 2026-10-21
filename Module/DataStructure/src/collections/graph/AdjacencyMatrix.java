package collections.graph;

public class AdjacencyMatrix implements Graph {
	int[][] adjMatrix;
	int vertexCount;
	boolean isDirected;

	public AdjacencyMatrix(int n, boolean isDirected) {
		this.vertexCount = n;
		this.isDirected = isDirected;
		adjMatrix = new int[vertexCount][vertexCount]; 
	}

	@Override
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}

	@Override
	public void addEdge(int u, int v, int w) {
		adjMatrix[u][v] = w;
		if (!isDirected) {
			adjMatrix[v][u] = w;
		}
	}

	private void dfsHelper(int startVertex, boolean[] isVisited) {
		isVisited[startVertex] = true;
		System.out.print(startVertex + " ");

		for (int v = 0; v < vertexCount; v++) {
			if (adjMatrix[startVertex][v] != 0 && !isVisited[v]) {
				dfsHelper(v, isVisited);
			}
		}
	}

	@Override
	public void printDFS(int startVertex) {
		boolean[] isVisited = new boolean[vertexCount];
		dfsHelper(startVertex, isVisited);
		System.out.println("");
	}

	@Override
	public void printBFS(int startVertex) {
	}

	@Override
	public void dijkstraShortestPath(int startVertex, int destVertex) {
	}
	public boolean isConnected() {
	    if (vertexCount <= 0) return true;
	    boolean[] isVisited = new boolean[vertexCount];
	    dfsCountHelper(0, isVisited);
	    for (boolean visited : isVisited) {
	        if (!visited) return false;
	    }
	    return true;
	}

	public int connectedComponentCount() {
	    if (vertexCount <= 0) return 0;
	    boolean[] isVisited = new boolean[vertexCount];
	    int count = 0;
	    for (int i = 0; i < vertexCount; i++) {
	        if (!isVisited[i]) {
	            count++;
	            dfsCountHelper(i, isVisited);
	        }
	    }
	    return count;
	}

	private void dfsCountHelper(int startVertex, boolean[] isVisited) {
	    isVisited[startVertex] = true;
	    for (int v = 0; v < vertexCount; v++) {
	        if (adjMatrix[startVertex][v] != 0 && !isVisited[v]) {
	            dfsCountHelper(v, isVisited);
	        }
	    }
	}
}