

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;

class Graph {
	int n;
	int[][] adj;

	public Graph(int[][] _adj) {
		adj = _adj;
		n = adj.length;
		
	}

	public void printGraph(String outFile) throws IOException {
		PrintWriter pr = new PrintWriter(outFile);
		pr.println("Edge\t\tWeight");
		boolean[] vis = new boolean[n];
		this.DFS(0, vis, pr);
		pr.close();
	}

	private void DFS(int u, boolean[] vis, PrintWriter pr) {
		// TODO: Implement DFS(Depth First Traversal), printing edges to pr as it functions
		
		vis[u]=true;   //Current node has been visited as not to visit again
		
		//Traverses through each matrix printing to file the Edge Weight 
		//Refer to slide 11 from 06 - Graphs - (5) Traversals -- 1 sld-pp
		 for(int j=0; j<getn(); j++) {
			  
			       if(!vis[j] ) {
			    	 
			    	     
			     for(int k=0; k<getn(); k++) {
			      
				 pr.print(u+"-"+k+" ");
				 pr.println("\t\t"+adj[u][k]);
				 
			        }
			     DFS(j, vis,pr); 
			     
			       }
			   }
		 }
			 
		
			 
		 
		 
	

	private int getn() {
		// TODO Auto-generated method stub
	
		return this.n;
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

