import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecodeTheTape {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String line = br.readLine();
		while (!line.equals("___________")) {

			line = line.replaceAll("[^o ]", "");
			line = line.replaceAll("[ ]", "0");
			line = line.replaceAll("[o]", "1");
			int num = Integer.parseInt(line, 2);
			char c = (char) num;
			System.out.print(c);
			line = br.readLine();
		}

	}

}
