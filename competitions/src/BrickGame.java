import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrickGame {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			String[] line = bf.readLine().split(" ");

			System.out.println("Case " + (i + 1) + ": " + line[((line.length - 1) / 2) + 1]);

		}

	}


}
