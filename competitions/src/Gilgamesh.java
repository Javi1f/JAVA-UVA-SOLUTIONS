import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Gilgamesh {

	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] line = bf.readLine().split(" ");

		Graph g = new Graph(Integer.parseInt(line[0]));
		visited = new boolean[Integer.parseInt(line[0])];
		for (int i = 0; i < Integer.parseInt(line[1]); i++) {
			String[] edges = bf.readLine().split(" ");
			g.addEdge(Integer.parseInt(edges[0]) - 1, Integer.parseInt(edges[1]) - 1);
		}

		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				g.DFS(i);
				count++;
			}
		}
		System.out.println(count);
	}

	static class Graph {
		private LinkedList<Integer> adj[];

		Graph(int v) {
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) {
				adj[i] = new LinkedList();
			}
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
			adj[w].add(v);
		}

		void DFSUtil(int v, boolean[] visited) {
			visited[v] = true;
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					DFSUtil(n, visited);
				}
			}
		}

		void DFS(int v) {
			DFSUtil(v, visited);
		}

	}
}
