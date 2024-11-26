import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Aerolinea {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int m = Integer.parseInt(bf.readLine());
		Graph g = new Graph(n);
		for (int i = 0; i < m; i++) {
			String[] line = bf.readLine().split(" ");
			g.addEdge(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
		}
		for (int i = 0; i < n; i++) {
			g.DFS(i, i);

		}
	}

	static class Graph {
		private int V;
		private LinkedList<Integer> adj[];

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) {
				adj[i] = new LinkedList<Integer>();
			}
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		void DFSUtil(int v, boolean visited[], int act, int count) {
			visited[v] = true;
			Iterator<Integer> i = adj[v].listIterator();

			while (i.hasNext()) {
				int n = i.next();
				if (n == act && count != 1) {
					System.out.print(act + " ");
					return;
				} else if (!visited[n]) {
					DFSUtil(n, visited, act, count + 1);
				}
			}
		}

		void DFS(int v, int act) {
			boolean visited[] = new boolean[V];
			DFSUtil(v, visited, act, 0);
		}

	}
}
