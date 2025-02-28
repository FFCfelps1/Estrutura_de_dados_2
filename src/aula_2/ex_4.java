import java.util.Random;

public class MatrixSymmetryChecker {

    public static void main(String[] args) {
        int[] parametros = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};

        for (int n = 0; n<parametros.length; n+=2) {
            long startTime = System.nanoTime();
            
            int[][] matrix = new int [parametros[tamanho]][parametros[tamanho + 1]];
            boolean isSymmetric = checkSymmetry(matrix);
            
            long endTime = System.nanoTime();

            System.out.println("Matrix size: " + n + "x" + n);
            System.out.println("Symmetric: " + isSymmetric);
            System.out.println("Time taken: " + (endTime - startTime));
            System.out.println("--------------------------------");
        }
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
