import java.util.Scanner;

public class pruebas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el tamaño de la matriz:");
		int tamano = scanner.nextInt();

		int[][] matriz = new int[tamano][tamano];

		int valor = 1;

		// Llenar la matriz en forma de abanico
		for (int capa = 0; capa < (tamano + 1) / 2; capa++) {
			// Llenar la parte superior de la capa
			for (int i = capa; i < tamano - capa; i++) {
				matriz[capa][i] = valor++;
			}

			// Llenar la parte derecha de la capa
			for (int i = capa + 1; i < tamano - capa; i++) {
				matriz[i][tamano - 1 - capa] = valor++;
			}

			// Llenar la parte inferior de la capa (si aplica)
			for (int i = tamano - 2 - capa; i >= capa && tamano - 1 - capa != capa; i--) {
				matriz[tamano - 1 - capa][i] = valor++;
			}

			// Llenar la parte izquierda de la capa (si aplica)
			for (int i = tamano - 2 - capa; i > capa && tamano - 1 - capa != capa; i--) {
				matriz[i][capa] = valor++;
			}
		}

		// Imprimir la matriz
		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();
	}
}
