import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEXQuotes {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int count = 1;
		while ((line = bf.readLine()) != null) {

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < line.length(); i++) {

				if (line.charAt(i) == '"') {
					if (count % 2 != 0) {
						sb.append("``");
					} else {
						sb.append("''");
					}
					count++;
				} else {
					sb.append(line.charAt(i) + "");
				}

			}
			System.out.println(sb.toString());

		}

	}

}
