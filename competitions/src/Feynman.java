import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Feynman {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {

		String n = "";

		while (Integer.parseInt((n = bf.readLine())) != 0) {

			int parse = Integer.parseInt(n);

			System.out.println((parse * (parse + 1) * ((2 * parse) + 1)) / 6);

		}
	}

}
