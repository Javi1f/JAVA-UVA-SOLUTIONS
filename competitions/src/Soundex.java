import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Soundex {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> mapto = new HashMap<>();

		mapto.put('B', 1);
		mapto.put('F', 1);
		mapto.put('P', 1);
		mapto.put('V', 1);
		mapto.put('C', 2);
		mapto.put('G', 2);
		mapto.put('J', 2);
		mapto.put('K', 2);
		mapto.put('Q', 2);
		mapto.put('S', 2);
		mapto.put('X', 2);
		mapto.put('Z', 2);
		mapto.put('D', 3);
		mapto.put('T', 3);
		mapto.put('L', 4);
		mapto.put('M', 5);
		mapto.put('N', 5);
		mapto.put('R', 6);

		String line;
		while ((line = bf.readLine()) != null) {

			StringBuilder sb = new StringBuilder();
			int prev = 0;
			for (int i = 0; i < line.length(); i++) {

				if (mapto.containsKey(line.charAt(i))) {
					int aux = mapto.get(line.charAt(i));

					if (aux != prev) {
						sb.append(mapto.get(line.charAt(i)));
						prev = aux;
					}
				} else if (prev != 0 && !mapto.containsKey(line.charAt(i))) {
					prev = 0;
				}

			}
			System.out.println(sb.toString());

		}

	}

}
