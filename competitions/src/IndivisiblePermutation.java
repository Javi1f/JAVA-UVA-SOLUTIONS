import java.util.LinkedList;
import java.util.Scanner;

public class IndivisiblePermutation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int N = sc.nextInt();
			LinkedList<Integer> P = new LinkedList<>();
			for (int j = 0; j < N; j++) {
				P.add(j + 1);
			}
			int a = P.removeLast();
			P.addFirst(a);

			System.out.println(P.toString().replace("[", "").replace("]", "").replace(",", ""));
		}

		sc.close();
	}

}
