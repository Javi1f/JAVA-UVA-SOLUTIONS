import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ddcoder {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String line = "";

		while ((line = bf.readLine()) != null) {

			for (int i = 0; i < line.length(); i++) {

				char parse = (char) (line.charAt(i) - 7);
				System.out.print(parse);
			}
			System.out.println();
		}

	}

}
