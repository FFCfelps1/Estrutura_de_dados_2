public class MatrixSymmetryChecker {

    public static void main(String[] args) {

                int[][] matrix = new int[10][10]; // Corrigido para usar 'n'
                boolean isSymmetric = checkSymmetry(matrix, counter);
                // boolean isSymmetric = checkSymmetry(matrix, counter): Sigma chamada + Sigma retorno + 2 * Sigma arm + Sigma rec
                // 4
            }

    private static boolean checkSymmetry(int[][] matrix, Counter counter) {
        int n = 10;
        // int n = 10: Sigma rec + Sigma arm
        // 2
        for (int i = 0; i < n; i++) {
            // int i = 0: Sigma rec + Sigma arm
            // 2
            // i < 10: 2* Sigma rec + Sigma <
            // 3
            // i++: 2 * Sigma rec + Sigma"+" + Sigma arm
            // 4
            for (int j = i + 1; j < n; j++) { // Verifica apenas metade da matriz
                // int j = 0: Sigma rec + Sigma arm
                // 2
                // j < 10: 2* Sigma rec + Sigma <
                // 3
                // j++: 2 * Sigma rec + Sigma"+" + Sigma arm
                // 4
                if (matrix[i][j] != matrix[j][i]) {
                    // matrix[i][j] != matrix[j][i]: 5 * Sigma rec + 2 * Sigma . + Sigma < + Sigma arm
                    // 9
                    return false;
                }
            }
        }
        return true;
    }

}

/*
10 : 3300
50 : 82500
100 : 330000
500 : 8250000
1000 : 33000000
5000 : 825000000
10000 : 3300000000
50000 : 82500000000
100000 : 330000000000
500000 : 8250000000000
*/