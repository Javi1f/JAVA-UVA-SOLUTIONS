import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class RedundancyDepartment {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		Map<Integer, Integer> mapto = new LinkedHashMap<Integer, Integer>();
		String line;
		while ((line = bf.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				line = st.nextToken();
				if (!mapto.containsKey(Integer.parseInt(line)))
					mapto.put(Integer.parseInt(line), 0);

				mapto.put(Integer.parseInt(line), mapto.get(Integer.parseInt(line)) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : mapto.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
