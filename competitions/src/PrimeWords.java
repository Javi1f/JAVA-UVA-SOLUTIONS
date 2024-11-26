import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PrimeWords {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> mapto = new HashMap<>();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			mapto.put(ch, ch - 'a' + 1);
		}
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			mapto.put(ch, ch - 'A' + 27);
		}

		String line;
		while ((line = bf.readLine()) != null) {

			int temp = 0;

			for (int i = 0; i < line.length(); i++) {
				temp += mapto.get(line.charAt(i));
			}
			if (esPrimo(temp)) {
				System.out.println("It is a prime word.");
			} else {
				System.out.println("It is not a prime word.");
			}
		}

	}

	public static boolean esPrimo(int numero) {
		if (numero == 1) {
			return true;
		}
		if (numero < 2) {
			return false;
		}
		int limite = (int) Math.sqrt(numero);
		for (int i = 2; i <= limite; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}
