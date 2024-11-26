import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HangmanJudge {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String n = "";

		while ((Integer.parseInt(n = bf.readLine())) != -1) {
			String adv = bf.readLine();
			String read = bf.readLine();
			boolean ch = true;
			HashSet<Character> use = new HashSet<>();
			int count = 0;
			System.out.println("Round " + n);

			for (int i = 0; i < read.length(); i++) {
				if (!(use.add(read.charAt(i)))) {
					continue;
				}
				if (adv.indexOf(read.charAt(i)) != -1) {
					adv = adv.replace(read.charAt(i) + "", "");
					if (adv.length() == 0) {

						System.out.println("You win.");
						ch = false;
						break;
					}
				} else {
					count++;
					if (count == 7) {
						System.out.println("You lose.");
						ch = false;
						break;
					}

				}

			}
			if (ch) {

				System.out.println("You chickened out.");
			}
		}

	}

}
