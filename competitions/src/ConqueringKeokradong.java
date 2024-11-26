import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConqueringKeokradong {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> answer = new ArrayList<>();

	public static void main(String[] args) {

		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			System.out.println("Case " + i + ": ");
			func();
		}

	}

	static void func() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> v = new ArrayList<>();
		int lo = 0;
		int hi = 0;
		int ans = -1;
		for (int i = 0; i < n + 1; i++) {
			int temp = sc.nextInt();
			v.add(temp);
			if (temp > lo) {
				lo = temp;
			}
			hi += temp;
		}

		while (hi >= lo) {

			int mi = (hi + lo) >> 1;

			if (ok(mi, v, k)) {
				ans = mi;
				hi = mi - 1;
			} else {
				lo = mi + 1;
			}

		}
		ok(ans, v, k);
		System.out.println(ans + "\n");

		int df = k + 1 - answer.size();

		ArrayList<Integer> vec = new ArrayList<>();

		while (df > 0) {
			int b = v.get(v.size() - 1);
			v.remove(v.size() - 1);
			vec.add(b);
			answer.set(answer.size() - 1, answer.get(answer.size() - 1) - b);
			if (answer.get(answer.size() - 1) == 0) {
				answer.remove(answer.size() - 1);
			} else {
				df--;
			}
		}
		Collections.reverse(vec);

		for (Integer x : vec) {
			answer.add(x);
		}

		for (Integer x : answer) {
			System.out.println(x + "\n");
		}

	}

	static boolean ok(int mid, ArrayList<Integer> v, int k) {
		ArrayList<Integer> now = new ArrayList<>();

		int curr = 0;
		int walked = 0;

		for (Integer x : v) {
			if (walked + x > mid) {
				now.add(walked);
				if (curr++ > k) {
					return false;
				}
				walked = x;
			} else {
				walked += x;
			}
		}
		now.add(walked);
		answer = now;
		return true;

	}

}
