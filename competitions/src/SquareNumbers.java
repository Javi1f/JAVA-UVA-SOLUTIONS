import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			}
			int count = 0;
			for (int i = a; i <= b; i++) {
				if (calc(i)) {
					count++;
				}
			}
			System.out.println(count);

		}
		sc.close();
	}

	public static boolean calc(int numero) {
		if (numero < 0) {
			return false;
		}

		int raiz = (int) Math.sqrt(numero);
		return raiz * raiz == numero;
	}

}
