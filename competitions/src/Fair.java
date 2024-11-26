import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fair {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] line = bf.readLine().split(" ");

		int n = Integer.parseInt(line[1]);

		String[] nums = bf.readLine().split(" ");

		int[] reals = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			reals[i] = Integer.parseInt(nums[i]);
		}

		Arrays.sort(reals);
		int max = 0;
		for (int i = 0; i < reals.length; i++) {
			if (reals[i] <= n) {
				max = reals[i];
			}
		}
		System.out.println(max);

	}

}
