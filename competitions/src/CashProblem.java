import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CashProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());

		Map<Integer, Integer> mapto = minBills(N);

		int count = 1;
		for (Map.Entry<Integer, Integer> entry : mapto.entrySet()) {
			if (count != 1 && entry.getValue() != 0) {
				System.out.print(" ");
			}
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
				count++;
			} else if (entry.getValue() > 1) {
				for (int i = 0; i < entry.getValue(); i++) {
					if (i != 0) {
						System.out.print(" ");
					}
					System.out.print(entry.getKey());
				}
				count++;

			}
		}

	}

	public static Map<Integer, Integer> minBills(int N) {
		int[] denominations = { 500, 100, 50, 10, 5, 1 };
		Map<Integer, Integer> billCount = new TreeMap<>();

		for (int bill : denominations) {
			if (N >= bill) {
				int count = N / bill;
				N -= count * bill;
				billCount.put(bill, count);
			} else {
				billCount.put(bill, 0);
			}
		}

		return billCount;
	}
}
