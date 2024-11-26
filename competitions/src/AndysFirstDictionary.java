import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class AndysFirstDictionary {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> sisas = new ArrayList<>();
		String line;
		while ((line = bf.readLine()) != null) {
			line = line.toLowerCase().replaceAll("[^a-zA-Z ]", " ");
			StringTokenizer st = new StringTokenizer(line);

			while (st.hasMoreTokens()) {
				String aux = st.nextToken();
				if (!sisas.contains(aux)) {
					sisas.add(aux);
				}

			}

		}
		Collections.sort(sisas);
		sisas.forEach(a -> {
			System.out.println(a);
		});

	}

}
