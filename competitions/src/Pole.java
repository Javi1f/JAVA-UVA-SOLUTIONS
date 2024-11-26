import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pole {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = 0;

		while ((n = sc.nextInt()) != 0) {
			ArrayList<Integer> num = new ArrayList<>();
			ArrayList<Integer> pos = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				num.add(sc.nextInt());
				pos.add(sc.nextInt());
			}
			int[] newPos = new int[n];
			boolean conf = false;
			for (int i = 0; i < newPos.length; i++) {
				if (pos.get(i) == 0) {
					newPos[i] = num.get(i);

				} else if (((pos.get(i) > 0) && (i + pos.get(i) > newPos.length))
						|| ((pos.get(i) < 0) && (i - (pos.get(i) * -1) < 0))
						|| ((pos.get(i) < 0) && (newPos[i - (pos.get(i) * -1)] != 0))
						|| ((pos.get(i) > 0) && (newPos[i + pos.get(i)] != 0))) {
					System.out.println("-1");
					conf = true;
				} else if (pos.get(i) > 0) {
					newPos[i + pos.get(i)] = num.get(i);
				} else if (pos.get(i) < 0) {
					newPos[i - (pos.get(i) * -1)] = num.get(i);
				}
			}
			if (!conf) {
				for (int i = 0; i < newPos.length; i++) {
					System.out.print(newPos[i] + " ");

				}
				System.out.println();
			}
		}
		sc.close();
	}

}
