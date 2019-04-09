

import java.util.*;
import java.io.File;
import java.io.IOException;

public class Asgmt4 {
	public static void main(String[] args) throws IOException {
		String[] fnameExt = args[0].split("\\.");
		Scanner kb = new Scanner(new File(args[0]));
		int x = kb.nextInt(), y = kb.nextInt(), n = kb.nextInt();
//TESTING
//		System.out.println(x); 
//		System.out.println(y);
//		System.out.println(n);
		
		ArrayList<PixelVertex> verts = new ArrayList<>(n);
		int[][] adj = new int[n][n];
		for (int i = 0; i < n; i++)
			adj[i][i] = -1;				// represent absence of self-edges

		for (int i = 0; i < n; i++) {
			int name = kb.nextInt();
			int next=0;
			PixelVertex vert = new PixelVertex(x*y);
			
			// TODO: Fill in vert.pixel (one-dimensional rep. of matrix)
			//SAM-Splaining: Puts each matrix into the one-dimensional array false if 0 and true if 1 
			for(int j=0; j<x*y;j++) {
				if((next=kb.nextInt())==0) {
				vert.pixel[j]=false;
				}
				else
					vert.pixel[j]=true;
					
			}
			

		
			
               
			// TODO: Add vert to 'verts' ArrayList
			  verts.add(vert);
		}
		
		for (int i = 0; i < n; i++) {
		/* TODO: Use vert.difference method to calculate difference
		 *		 between vert and all vertices in 'verts' ArrayList
		 */
		//SAM-Splaining: Compare each difference using the given method, this value I assume is the Weight
		//I then put it into the adj matrix which I believe represents the matrix seen in slide 21 on Graphs (Review)
		
		for(int k=0; k<n;k++) {
			adj[i][k]=verts.get(i).difference(verts.get(k));
			//Test to see weight matrix
			//System.out.print(adj[i][k]);
			
							}
		
		//System.out.println();
		}
		
		

		Graph g = new Graph(adj);
		if (fnameExt.length >= 2) {
			g.printGraph(fnameExt[0] + "-GRAPH_out." + fnameExt[1]);
			g.printMST(fnameExt[0] + "-MST_out." + fnameExt[1]);
		}
		else {
			g.printGraph(fnameExt[0] + "-GRAPH_out");
			g.printMST(fnameExt[0] + "-MST_out");
		}
	}
}