import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AgeSort {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while (!(line = bf.readLine()).equals("0")) {

			String[] n = bf.readLine().split(" ");
			int[] nums = new int[Integer.parseInt(line)];

			for (int i = 0; i < Integer.parseInt(line); i++) {
				nums[i] = Integer.parseInt(n[i]);
			}

			Arrays.sort(nums);

			System.out.println(Arrays.toString(nums).replace("[", "").replace("]", "").replace(",", ""));

		}

	}

}
