import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuirksomeSquares {

	public static void main(String[] args) throws IOException {

		String[] two = { "00", "01", "81", };
		String[] four = { "0000", "0001", "2025", "3025", "9801" };
		String[] six = { "000000", "000001", "088209", "494209", "998001" };
		String[] eight = { "00000000", "00000001", "04941729", "07441984", "24502500", "25502500", "52881984",
				"60481729", "99980001" };

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = bf.readLine()) != null) {

			if (line.equals("2")) {
				System.out.println(
						Arrays.toString(two).replace("[", "").replace("]", "").replace(",", "\n").replace(" ", ""));
			} else if (line.equals("4")) {
				System.out.println(
						Arrays.toString(four).replace("[", "").replace("]", "").replace(",", "\n").replace(" ", ""));
			} else if (line.equals("6")) {
				System.out.println(
						Arrays.toString(six).replace("[", "").replace("]", "").replace(",", "\n").replace(" ", ""));
			} else if (line.equals("8")) {
				System.out.println(
						Arrays.toString(eight).replace("[", "").replace("]", "").replace(",", "\n").replace(" ", ""));
			}

		}

	}

}
