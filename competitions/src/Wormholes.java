import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wormholes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String[] in = bf.readLine().split(" ");
			Graph g = new Graph();
			for (int j = 0; j < Integer.parseInt(in[0]); j++) {
				g.addNode(j);
			}

			for (int j = 0; j < Integer.parseInt(in[1]); j++) {
				String[] edge = bf.readLine().split(" ");
				g.addEdge(Integer.parseInt(edge[0]), Integer.parseInt(edge[1]), Integer.parseInt(edge[2]));
			}

			if (g.hasNegativeCycle(0)) {
				System.out.println("possible");
			} else {
				System.out.println("not possible");
			}

		}

	}

	static class Edge {
		int targetNode;
		int weight;

		public Edge(int targetNode, int weight) {
			this.targetNode = targetNode;
			this.weight = weight;
		}
	}

	static class Graph {
		private final Map<Integer, List<Edge>> adjacencyList;

		public Graph() {
			this.adjacencyList = new HashMap<>();
		}

		public void addNode(int node) {
			adjacencyList.putIfAbsent(node, new ArrayList<>());
		}

		public void addEdge(int sourceNode, int targetNode, int weight) {
			adjacencyList.get(sourceNode).add(new Edge(targetNode, weight));
		}

		public List<Edge> getEdges(int node) {
			return adjacencyList.getOrDefault(node, new ArrayList<>());
		}

		public void printGraph() {
			for (Map.Entry<Integer, List<Edge>> entry : adjacencyList.entrySet()) {
				System.out.print("Node " + entry.getKey() + " has edges to: ");
				for (Edge edge : entry.getValue()) {
					System.out.print("Node " + edge.targetNode + " (weight " + edge.weight + "), ");
				}
				System.out.println();
			}
		}

		public boolean hasNegativeCycle(int startNode) {
			int numNodes = adjacencyList.size();
			Map<Integer, Integer> distances = new HashMap<>();

			for (Integer node : adjacencyList.keySet()) {
				distances.put(node, Integer.MAX_VALUE);
			}
			distances.put(startNode, 0);

			for (int i = 1; i <= numNodes - 1; i++) {
				for (Integer node : adjacencyList.keySet()) {
					for (Edge edge : getEdges(node)) {
						if (distances.get(node) != Integer.MAX_VALUE
								&& distances.get(node) + edge.weight < distances.get(edge.targetNode)) {
							distances.put(edge.targetNode, distances.get(node) + edge.weight);
						}
					}
				}
			}

			for (Integer node : adjacencyList.keySet()) {
				for (Edge edge : getEdges(node)) {
					if (distances.get(node) != Integer.MAX_VALUE
							&& distances.get(node) + edge.weight < distances.get(edge.targetNode)) {
						return true;
					}
				}
			}

			return false;
		}

	}
}
