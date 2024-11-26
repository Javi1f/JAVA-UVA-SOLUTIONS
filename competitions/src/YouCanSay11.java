import java.util.Scanner;

public class YouCanSay11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String numero = scanner.nextLine().replace(" ", "");
			if (numero.equals("0")) {
				break;
			}
			if (esMultiploDe11(numero)) {
				System.out.println(numero + " is a multiple of 11.");
			} else {
				System.out.println(numero + " is not a multiple of 11.");
			}
		}
		scanner.close();
	}

	public static boolean esMultiploDe11(String numero) {
		int suma = 0;
		for (int i = 0; i < numero.length(); i++) {
			int digito = Character.getNumericValue(numero.charAt(i));
			if (i % 2 == 0) {
				suma += digito;
			} else {
				suma -= digito;
			}
		}
		return suma % 11 == 0;
	}
}
