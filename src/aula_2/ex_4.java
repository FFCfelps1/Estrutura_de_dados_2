import java.util.Random;

public class MatrixSymmetryChecker {

    public static void main(String[] args) {
        int[] sizes = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        Random random = new Random();

        for (int n : sizes) {
            int[][] matrix = generateMatrix(n, random);

            long startTime = System.nanoTime();
            boolean isSymmetric = checkSymmetry(matrix);
            long endTime = System.nanoTime();

            System.out.println("Matrix size: " + n + "x" + n);
            System.out.println("Symmetric: " + isSymmetric);
            System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
            System.out.println("--------------------------------");
        }
    }

    private static int[][] generateMatrix(int n, Random random) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100); // Valores de 0 a 99
            }
        }
        return matrix;
    }

    private static boolean checkSymmetry(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Verifica apenas metade da matriz
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
