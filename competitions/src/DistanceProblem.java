import java.util.Scanner;

public class DistanceProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] coords = new int[n][2];
		for (int i = 0; i < n; i++) {

			coords[i][0] = sc.nextInt();
			coords[i][1] = sc.nextInt();

		}
		int[][] cp = findClosestPair(coords);
		System.out.println(distance(cp[0], cp[1]));
		sc.close();
	}

	public static int[][] findClosestPair(int[][] coordinates) {
		double minDist = Double.MAX_VALUE;
		int[][] closestPair = new int[2][2];

		for (int i = 0; i < coordinates.length - 1; i++) {
			for (int j = i + 1; j < coordinates.length; j++) {
				double dist = distance(coordinates[i], coordinates[j]);
				if (dist < minDist) {
					minDist = dist;
					closestPair[0] = coordinates[i];
					closestPair[1] = coordinates[j];
				}
			}
		}

		return closestPair;
	}

	private static double distance(int[] point1, int[] point2) {
		return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
	}

}
