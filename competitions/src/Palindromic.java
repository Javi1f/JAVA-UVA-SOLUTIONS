import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bf.readLine());

		for (int i = 0; i < T; i++) {

			String temp = bf.readLine();
			StringBuilder sb = new StringBuilder(temp);
			sb.reverse();

			if (temp.equals(sb.toString())) {
				System.out.println("Case " + (i + 1) + ": Yes");
			} else {
				System.out.println("Case " + (i + 1) + ": No");
			}
		}
	}

}
