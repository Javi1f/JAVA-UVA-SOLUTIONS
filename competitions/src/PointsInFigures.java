import java.util.ArrayList;
import java.util.Scanner;

public class PointsInFigures {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<double[]> newdic = new ArrayList<>();
		String line;

		while (true) {
			line = sc.nextLine();
			if (line.equals("*")) {
				break;
			}
			String[] temp = line.split(" ");
			newdic.add(new double[] { Double.parseDouble(temp[1]), Double.parseDouble(temp[2]),
					Double.parseDouble(temp[3]), Double.parseDouble(temp[4]) });
		}

		String line2;
		int p = 1;
		while (true) {
			line2 = sc.nextLine();
			if (line2.equals("9999.9 9999.9")) {
				break;
			}
			String[] temp = line2.split(" ");
			boolean veri = false;
			for (int j = 0; j < newdic.size(); j++) {
				if (puntoEnRectangulo(Double.parseDouble(temp[0]), Double.parseDouble(temp[1]), newdic.get(j)[0],
						newdic.get(j)[1], newdic.get(j)[2], newdic.get(j)[3])) {
					System.out.println("Point " + p + " is contained in figure " + (j + 1));
					veri = true;
				}
			}
			if (!veri) {
				System.out.println("Point " + p + " is not contained in any figure");
			}
			p++;
		}
		sc.close();
	}

	public static boolean puntoEnRectangulo(double x, double y, double x1, double y1, double x2, double y2) {
		return x1 < x && x < x2 && y2 < y && y < y1;
	}
}
