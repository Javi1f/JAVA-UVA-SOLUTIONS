import java.util.Scanner;

public class Screammers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int R = sc.nextInt();

		long v = calcularValorDesbloqueo(D, R);

		System.out.println(v);
		sc.close();
	}

	public static long calcularValorDesbloqueo(int dimension, int radio) {
		long modulo = 1000000007; // Módulo 10^9 + 7
		long valor = 0;

		// Calcular la suma de los valores absolutos de las coordenadas de los puntos
		// enteros dentro de la esfera
		for (int x = -radio; x <= radio; x++) {
			for (int y = -radio; y <= radio; y++) {
				for (int z = -radio; z <= radio; z++) {
					// Verificar si el punto está dentro de la esfera
					if (x * x + y * y + z * z <= radio * radio) {
						// Calcular el valor absoluto de las coordenadas y sumarlo al total
						valor = (valor + Math.abs(x) + Math.abs(y) + Math.abs(z)) % modulo;
					}
				}
			}
		}

		return valor;
	}
}
