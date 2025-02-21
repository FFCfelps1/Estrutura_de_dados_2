public class Matrixces {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] matrix = new int[rows][columns];

        // Inicializa a matriz com valores aleatórios
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        // Imprime a matriz original
        System.out.println("Matriz Original:");
        printMatrix(matrix);

        // Transpõe a matriz
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Imprime a matriz transposta
        System.out.println("Matriz Transposta:");
        printMatrix(transposedMatrix);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}