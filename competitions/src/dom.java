import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dom {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String n = bf.readLine();

		for (int i = 0; i < Integer.parseInt(n); i++) {

			String line = bf.readLine();
			String[] line2 = line.split(":");

			if (line2[0].matches(".*s$")) {
				System.out.println("Case " + (i + 1) + ": " + line);
			} else {
				System.out.println("Case " + (i + 1) + ": " + line2[0] + "s:" + line2[1]);
			}

		}

	}

}
