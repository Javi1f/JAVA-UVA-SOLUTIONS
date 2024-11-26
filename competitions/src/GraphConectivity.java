import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GraphConectivity {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> dic = new HashMap<>();
		for (int i = 0; i < 26; i++) {
			dic.put((char) ('A' + i), i + 1);
		}

		int cases = Integer.parseInt(bf.readLine());
		bf.readLine();
		for (int i = 0; i < cases; i++) {
			dj ds = new dj(dic.get(bf.readLine().charAt(0)));

			while (true) {
				String line = bf.readLine();
				if (line == null) {
					break;
				}
				if (line.isEmpty()) {
					break;
				}
				ds.union(dic.get(line.charAt(0)) - 1, dic.get(line.charAt(1)) - 1);
			}
			System.out.println(ds.getCount());
			if (i != cases - 1) {
				System.out.println();
			}
		}

	}
}

class dj {
	private int[] parent;
	private int[] rank;
	private int count;

	public dj(int n) {
		parent = new int[n];
		rank = new int[n];
		count = n;

		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	public int find(int x) {
		if (parent[x] != x) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}

	public void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);

		if (rootX != rootY) {
			if (rank[rootX] > rank[rootY]) {
				parent[rootY] = rootX;
			} else if (rank[rootX] < rank[rootY]) {
				parent[rootX] = rootY;
			} else {
				parent[rootY] = rootX;
				rank[rootX]++;
			}
			count--;
		}
	}

	public int getCount() {
		return count;
	}
}
