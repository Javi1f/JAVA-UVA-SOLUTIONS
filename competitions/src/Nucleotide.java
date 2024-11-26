import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Nucleotide {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		HashMap<Character, Integer> mapto = new LinkedHashMap<>();
		TreeMap<Integer, StringBuilder> sort = new TreeMap<>();
		String DNA = " " + bf.readLine();

		int m = Integer.parseInt(bf.readLine());

		for (int i = 0; i < m; i++) {
			mapto.clear();
			mapto.put('A', 0);
			mapto.put('T', 0);
			mapto.put('G', 0);
			mapto.put('C', 0);

			String n = bf.readLine();

			int s = Integer.parseInt(n.split(" ")[0]);
			int e = Integer.parseInt(n.split(" ")[1]);

			String line = "";
			if (s != e) {
				line = DNA.substring(s, e + 1);
			} else {
				line = DNA.charAt(e) + "";
			}
			for (int j = 0; j < line.length(); j++) {
				mapto.put(line.charAt(j), mapto.get(line.charAt(j)) + 1);

			}
			StringBuilder r = new StringBuilder();
			sort.clear();
			for (char en : mapto.keySet()) {

				if (sort.containsKey(mapto.get(en))) {
					sort.put(mapto.get(en), sort.get(mapto.get(en)).append(en));
				} else {
					sort.put(mapto.get(en), new StringBuilder().append(en));
				}

			}
			for (Map.Entry<Integer, StringBuilder> entry : sort.entrySet()) {

				r.insert(0, entry.getValue());
			}
			System.out.println(r.toString());
		}

	}

}
