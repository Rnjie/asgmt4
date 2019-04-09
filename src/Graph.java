

import java.io.PrintWriter;
import java.io.IOException;
import java.util.PriorityQueue;

class Graph {
	int n;
	int[][] adj;

	public Graph(int[][] _adj) {
		adj = _adj;
		n = adj.length;
		System.out.println(n);
	}

	public void printGraph(String outFile) throws IOException {
		PrintWriter pr = new PrintWriter(outFile);
		pr.println("Edge\t\tWeight");
		boolean[] vis = new boolean[n];
		this.DFS(0, vis, pr);
		pr.close();
	}

	private void DFS(int u, boolean[] vis, PrintWriter pr) {
		// TODO: Implement DFS, printing edges to pr as it functions
	}

	public void printMST(String outFile) throws IOException {
		PrintWriter pr = new PrintWriter(outFile);
		pr.println("Edge\t\tWeight");
		this.prim(0, pr);
		pr.close();
	}

	private void prim(int s, PrintWriter pr) {
		/* TODO: Implement Prim's algorithm

		   - initialize cost, par, and vis arrays
		   - instantiate PriorityQueue pq, pass all vertices into pq wrapped in CostVertex
		   		(see DijkstraExample from website to see how this is done)
		   - iteratively poll PriorityQueue for vertex u with minimum cost
		   		- mark u as visited
		   		- iterate from v = 0 to n-1
		   			- if cost of edge from u to v is less than cost[v], update cost[v], par[v], and add appropriate CostVertex to pq

		   	- print result stored in cost and par

		 */
	}
}