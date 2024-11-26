import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormattedNumbers {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line = bf.readLine();
		StringBuilder aux = new StringBuilder(line);
		line = aux.reverse().toString();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < line.length(); i += 3) {

			if (i + 3 <= line.length()) {
				sb.append(line.substring(i, i + 3));
			} else {
				sb.append(line.substring(i));
			}

			if (i + 3 < line.length()) {
				sb.append(",");
			}
		}

		System.out.println(sb.reverse().toString());

	}

}
