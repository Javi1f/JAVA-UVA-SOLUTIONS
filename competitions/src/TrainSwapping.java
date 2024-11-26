import java.util.Scanner;

public class TrainSwapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int[] arr = new int[x];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			int count = bubbleSort(arr);

			System.out.println("Optimal train swapping takes " + count + " swaps.");

		}
		sc.close();
	}

	static int bubbleSort(int[] arr) {
		int n = arr.length;
		int moves = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					moves++;
				}
			}
		}
		return moves;
	}
}
