import java.util.Scanner;

public class RoddCutting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el tamaño de la varilla: ");
		int length = scanner.nextInt();

		int[] prices = { 0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 }; // precios para cada longitud i
		int[] cuts = new int[length + 1]; // matriz para almacenar los cortes óptimos
		String[] rodNames = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

		// Calcular los cortes óptimos y el valor máximo
		int[] dp = new int[length + 1];
		for (int i = 1; i <= length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 1; j <= i && j < prices.length; j++) {
				int value = prices[j] + dp[i - j];
				if (value > max) {
					max = value;
					cuts[i] = j; // almacenar el corte óptimo para longitud i
				}
			}
			dp[i] = max;
		}

		// Mostrar la matriz dp
		System.out.println("Matriz dp:");
		for (int i = 0; i <= length; i++) {
			System.out.print(dp[i] + " ");
		}
		System.out.println();

		// Mostrar el valor máximo y los cortes realizados
		System.out.println("Valor máximo obtenido: " + dp[length]);
		System.out.println("Cortes realizados:");
		int remainingLength = length;
		while (remainingLength > 0) {
			int cut = cuts[remainingLength];
			System.out.println("Corte " + rodNames[cut - 1] + " (Longitud " + cut + ")");
			remainingLength -= cut;
		}

		scanner.close();
	}
}
