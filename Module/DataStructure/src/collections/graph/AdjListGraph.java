package collections.graph;

import java.util.ArrayList;
import java.util.List;

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
		for (int i = 0; i < vertexCount; ++i) {
			isVisited[i] = false;
		}
		
		dfsHelper(startVertex, isVisited);
		System.out.println("");
	}

	@Override
	public void printBFS(int startVertex) {
		// TODO: Assignment
	}

	@Override
	public void dijkstraShortestPath(int startVertex, int destVertex) {
	}
}
