import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lost {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n - n; i++) {

		}
		String[] A = bf.readLine().split(" ");
		String[] B = bf.readLine().split(" ");

		System.out.println(calculateDistance(A, B));

	}

	public static int calculateDistance(String[] list1, String[] list2) {
		int n = list1.length;
		int m = list2.length;

		// Initialize the matrix
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= m; j++) {
			dp[0][j] = j;
		}

		// Fill the matrix
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (list1[i - 1].equals(list2[j - 1])) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					int num1 = Integer.parseInt(list1[i - 1]);
					int num2 = Integer.parseInt(list2[j - 1]);
					dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;

					// Check for transposition
					if (i > 1 && j > 1 && list1[i - 1].equals(list2[j - 2]) && list1[i - 2].equals(list2[j - 1])) {
						dp[i][j] = Math.min(dp[i][j], dp[i - 2][j - 2] + 1);
					}

					// Check for substitution
					dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + Math.abs(num1 - num2));
				}
			}
		}

		// Return the final distance
		return dp[n][m];
	}

	public static int bubbleSortCount(String[] arr) {
		int n = arr.length;
		int changes = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (compareNumbers(arr[j], arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changes++;
				}
			}
		}
		return changes;
	}

	public static int compareNumbers(String num1, String num2) {
		int intNum1 = Integer.parseInt(num1);
		int intNum2 = Integer.parseInt(num2);
		return intNum1 - intNum2;
	}
}
