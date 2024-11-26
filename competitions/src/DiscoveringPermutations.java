import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscoveringPermutations {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String n = bf.readLine();

		for (int i = 0; i < Integer.parseInt(n); i++) {

			String[] line = bf.readLine().split(" ");
			System.out.println(line);
		}
	}
}
