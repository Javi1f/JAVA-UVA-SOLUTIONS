import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Natatorium {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		long C = Long.parseLong(bf.readLine());
		long M = Long.parseLong(bf.readLine());
		Long.parseLong(M + "");
		String[] Pm = bf.readLine().split(" ");

		long[] nums = new long[Pm.length];
		for (int i = 0; i < Pm.length; i++) {
			nums[i] = Long.parseLong(Pm[i]);
		}

		long[] resp = findTwoNumbersWithProduct(nums, C);
		Arrays.sort(resp);
		System.out.println(resp[0] + " " + resp[1]);

	}

	public static long[] findTwoNumbersWithProduct(long[] arr, long targetProduct) {
		Map<Long, Long> seenNumbers = new HashMap<>();

		for (long num : arr) {
			if (targetProduct % num == 0) {
				long complement = targetProduct / num;
				if (seenNumbers.containsKey(complement)) {
					return new long[] { complement, num };
				}
			}
			seenNumbers.put(num, num);
		}

		return null;
	}
}
