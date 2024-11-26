import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElChocolatote {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String line = "";

		while ((line = bf.readLine()) != null) {
			String[] aux = line.split(" ");

			System.out.println((Integer.parseInt(aux[0]) * Integer.parseInt(aux[1]) - 1));

		}
	}

}
