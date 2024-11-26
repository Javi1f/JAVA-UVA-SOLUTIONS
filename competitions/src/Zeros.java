import java.util.Scanner;

public class Zeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			long x = sc.nextLong();
			int count = 0;
			for (int j = 0; j < 9; j++) {

				String parse = Long.toString(x, j + 1);
				if (parse.charAt(parse.length() - 1) == '0') {
					count++;
				}
			}
			System.out.println("Case " + (i + 1) + ":" + " " + count);
		}
		sc.close();
	}
//
//	public int[] findDivisors(long x) {
//		ArrayList<Integer> divisors = new ArrayList<Integer>();
//		for (int i = 0; i < x; i++) {
//			if (x % i == 0) {
//
//			}
//		}
//
//	}

}
