import java.util.Scanner;

public class Fastestest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float v = sc.nextInt();
		float n = sc.nextInt();

		float p = (n - v) / v;
		if (p > 0)
			System.out.println(p);
		else
			System.out.println(p * -1);
	}

}
