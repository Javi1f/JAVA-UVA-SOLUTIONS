import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DegreesofSeparation {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int count = 1;
		while (true) {

			int P = sc.nextInt();
			int R = sc.nextInt();
			if (P == 0 || R == 0) {
				break;
			}

			Graph g = new Graph(P);

			ArrayList<String> personas = new ArrayList<>();

			for (int i = 0; i < R; i++) {
				personas.add(sc.next());
				personas.add(sc.next());
			}
			HashMap<String, Integer> mapto = new HashMap<>();

			int count1 = 0;
			for (int i = 0; i < personas.size(); i++) {

				if (!mapto.containsKey(personas.get(i))) {
					mapto.put(personas.get(i), count1);
					count1++;
				}

			}

			for (int i = 1; i <= personas.size() - 1; i += 2) {
				g.addEdge(mapto.get(personas.get(i)), mapto.get(personas.get(i - 1)));
			}

			System.out.println(
					!g.esConexo() ? "Network " + count + ": " + (g.max()) : "Network " + count + ": DISCONNECTED");
			System.out.println();
			count++;
		}
		sc.close();
	}

	static class Graph {
		private int Vertices;
		private LinkedList<Integer> adj[];

		Graph(int v) {
			Vertices = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; i++) {
				adj[i] = new LinkedList<>();
			}
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
			adj[w].add(v);
		}

		public int find(int start) {
			boolean[] visited = new boolean[Vertices];
			int[] distance = new int[Vertices];
			Arrays.fill(distance, -1);

			Queue<Integer> queue = new LinkedList<>();
			visited[start] = true;
			distance[start] = 0;
			queue.add(start);

			int maxDistance = 0;

			while (!queue.isEmpty()) {
				int node = queue.poll();
				for (int neighbor : adj[node]) {
					if (!visited[neighbor]) {
						visited[neighbor] = true;
						distance[neighbor] = distance[node] + 1;
						queue.add(neighbor);

						if (distance[neighbor] > maxDistance) {
							maxDistance = distance[neighbor];
						}
					}
				}
			}

			return maxDistance;
		}

		public int max() {
			int maxDistance = 0;

			for (int i = 0; i < Vertices; i++) {
				maxDistance = Math.max(maxDistance, find(i));
			}

			return maxDistance;
		}

		private void dfs(int v, boolean[] visited) {
			visited[v] = true;

			for (int neighbor : adj[v]) {
				if (!visited[neighbor]) {
					dfs(neighbor, visited);
				}
			}
		}

		boolean esConexo() {
			boolean[] visited = new boolean[Vertices];
			int components = 0;

			for (int i = 0; i < Vertices; i++) {
				if (!visited[i]) {
					dfs(i, visited);
					components++;

					if (components > 1) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
