import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] spec = bf.readLine().split(" ");

        int m = Integer.parseInt(spec[0]);
        int n = Integer.parseInt(spec[1]);
        int p = Integer.parseInt(spec[2]);

        char[][] matrix1 = new char[m][n];

        for (int i = 0; i < m; i++) {
            String line = bf.readLine();
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = line.charAt(j);
            }
        }

        char[][] matrix2 = new char[m][p];

        for (int i = 0; i < m; i++) {
            String line = bf.readLine();
            for (int j = 0; j < p; j++) {
                matrix2[i][j] = line.charAt(j);
            }
        }

        if (checkMatrices(matrix1, matrix2)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

    }

    static boolean checkMatrices(char[][] matrix1, char[][] matrix2) {
        for (int j = 0; j < matrix2[0].length; j++) {
            char[] row = new char[matrix2.length];
            for (int i = 0; i < matrix2.length; i++) {
                row[i] = matrix2[i][j];
            }

            if (hasConflict(row, matrix1)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasConflict(char[] row, char[][] matrix1) {
        for (int j = 0; j < matrix1[0].length; j++) {
            for (int i = 0; i < matrix1.length; i++) {
                if (matrix1[i][j] == '-' && row[i] == '*') {
                    return true;
                }
            }
        }
        return false;
    }

}