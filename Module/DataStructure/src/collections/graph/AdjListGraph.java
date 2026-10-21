package collections.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjListGraph implements Graph {
	class EdgeInfo {
		int adjVertex;
		int weight;
		
		public EdgeInfo(int v, int w) {
			adjVertex = v;
			weight = w;
		}
	}

	List<List<EdgeInfo>> adjList;
	int vertexCount;
	boolean isDirected;

	public AdjListGraph(int n, boolean isDirected) {
		this.isDirected = isDirected;
		vertexCount = n;
		
		adjList = new ArrayList<>(vertexCount);
		for (int i = 0; i < vertexCount; ++i) {
			adjList.add(new ArrayList<>());
		}
	}

	@Override
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}

	@Override
	public void addEdge(int u, int v, int w) {
		adjList.get(u).add(new EdgeInfo(v, w));

		if (!isDirected) {
			adjList.get(v).add(new EdgeInfo(u, w));
		}
	}

	private void dfsHelper(int startVertex, boolean[] isVisited) {
		if (isVisited[startVertex]) {
			return;
		}
		
		isVisited[startVertex] = true;
		System.out.print(startVertex + " ");
		
		for (EdgeInfo edgeInfo : adjList.get(startVertex)) {
			if (!isVisited[edgeInfo.adjVertex]) {
				dfsHelper(edgeInfo.adjVertex, isVisited);
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
		boolean[] isVisited = new boolean[vertexCount];
		Queue<Integer> queue = new LinkedList<>();
		
		isVisited[startVertex] = true;
		queue.offer(startVertex);
		
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			System.out.print(curr + " ");
			
			for (EdgeInfo edgeInfo : adjList.get(curr)) {
				if (!isVisited[edgeInfo.adjVertex]) {
					isVisited[edgeInfo.adjVertex] = true;
					queue.offer(edgeInfo.adjVertex);
				}
			}
		}
		System.out.println("");
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
	    for (EdgeInfo edgeInfo : adjList.get(startVertex)) {
	        if (!isVisited[edgeInfo.adjVertex]) {
	            dfsCountHelper(edgeInfo.adjVertex, isVisited);
	        }
	    }
	}
}