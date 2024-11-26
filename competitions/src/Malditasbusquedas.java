
public class Malditasbusquedas {
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return mid;
			}

			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			}

			return binarySearch(arr, mid + 1, r, x);
		}

		return -1;
	}

	public static void main(String[] args) {

		int a = binarySearch(new int[] { 1, 2, 3, 4, 5 }, 0, 5, 3);
		System.out.println(a);
	}
}
