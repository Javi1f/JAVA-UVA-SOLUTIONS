import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MotherBear {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while (!(line = bf.readLine()).equals("DONE")) {

			line = line.replace(",", "").replace(" ", "").replace("!", "").replace("?", "").replace(".", "")
					.toLowerCase();

			if (line.equals(new StringBuilder(line).reverse().toString())) {
				System.out.println("You won't be eaten!");
			} else {
				System.out.println("Uh oh..");
			}

		}

	}

}
