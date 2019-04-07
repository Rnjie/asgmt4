package asgmt4;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class Asgmt4 {
	public static void main(String[] args) throws IOException {
		String[] fnameExt = args[0].split("\\.");
		Scanner kb = new Scanner(new File(args[0]));
		int x = kb.nextInt(), y = kb.nextInt(), n = kb.nextInt();
		ArrayList<PixelVertex> verts = new ArrayList<>(n);
		int[][] adj = new int[n][n];
		for (int i = 0; i < n; i++)
			adj[i][i] = -1;				// represent absence of self-edges

		for (int i = 0; i < n; i++) {
			int name = kb.nextInt();
			PixelVertex vert = new PixelVertex(x*y);
			
			// TODO: Fill in vert.pixel (one-dimensional rep. of matrix)

			/* TODO: Use vert.difference method to calculate difference
			 *		 between vert and all vertices in 'verts' ArrayList
			 */

			// TODO: Add vert to 'verts' ArrayList
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