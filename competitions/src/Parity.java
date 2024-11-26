import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parity {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while (!(line = bf.readLine()).equals("0")) {

			String bin = Integer.toBinaryString(Integer.parseInt(line));

			int count = 0;
			for (int i = 0; i < bin.length(); i++) {
				if (bin.charAt(i) == '1') {
					count++;
				}
			}

			System.out.println("The parity of " + bin + " is " + count + " (mod 2).");

		}

	}

}
