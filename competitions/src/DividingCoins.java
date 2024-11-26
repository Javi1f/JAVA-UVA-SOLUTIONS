import java.util.ArrayList;
import java.util.Scanner;

public class DividingCoins {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

		for (int j = 0; j < m; j++) {
			int n = sc.nextInt();

			Integer[] numeros = new Integer[n];
			for (int i = 0; i < n; i++) {
				numeros[i] = sc.nextInt();
			}
			ArrayList<Integer> copy = new ArrayList<>();
			int total = 0;
			for (int i = 0; i < n; i++) {
				total += numeros[i];
				copy.add(numeros[i]);
			}

			int mitad = total / 2;
			int sumaPrimeraMitad = 0;
			int sumaSegundaMitad = 0;
			int i = 0;
			int last = 0;
			while (sumaPrimeraMitad < mitad) {
				sumaPrimeraMitad += copy.get(i);
				last = copy.get(i);
				i++;
			}
			i = copy.indexOf(last) + 1;
			while (i < copy.size()) {
				sumaSegundaMitad += copy.get(i);
				i++;
			}

//			System.out.println("Primera mitad: " + sumaPrimeraMitad);
//			System.out.println("Segunda mitad: " + sumaSegundaMitad);

			System.out.println(Math.abs(Math.subtractExact(sumaPrimeraMitad, sumaSegundaMitad)));

		}
		sc.close();
	}
}
