
public class DiviDuelo {

	public static void main(String[] args) {
	}

	static int MCD(int a, int b) {
		if (a == 0) {
			return b;
		}

		return MCD(b % a, a);
	}

}
