package collections.graph;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacenyMatrix implements Graph{
	
	int vertexCount;
	int [][] adjMat;
	boolean isDirected;
	
	public AdjacenyMatrix(int n, boolean isDirected) {
		
		this.isDirected = isDirected;
		vertexCount = n;
		adjMat = new int[vertexCount][];
		
		for(int i=0;i<vertexCount;i++) {
			adjMat[i] = new int[vertexCount];
			
			for(int j=0;j<vertexCount;j++) {
				adjMat[i][j] = 0;
				
			}
		}
	}

	@Override
	public void addEdge(int u, int v) {
		addEdge(u,v,1);
		
	}

	@Override
	public void addEdge(int u, int v, int w) {
		adjMat[u][v] =w;
		
		if(!isDirected) {
			adjMat[v][u] = w;
		}
	}
	private void dfsHelper(int startVertex, boolean[] isVisited) {
	}

	@Override
	public void printBFS(int startVertex) {
		
	}

	@Override
	public void printDFS(int startVertex) {
		boolean[] isVisited = new boolean[vertexCount];
		for(int i=0;i<vertexCount;i++) {
			isVisited[i] = false;
		}
		
		Queue<Integer> q = new LinkedList<>();
		
		while(!q.isEmpty()) {
			int vi = q.remove();
			
			if(isVisited[vi]) {
				continue;
			}
			
			isVisited[vi] = true;
			System.out.println(vi + " ");
			
			for(int vj=0;vj<vertexCount;++vj) {
				if(adjMat[vi][vj]!=0 && !isVisited[vj]) {
					q.add(vj);
					
				}
			}
		}
		System.out.println("");
	}

	@Override
	public void dijkstraShortestPath(int startVertex, int destVertex) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
