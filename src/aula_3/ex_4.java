public class MatrixSymmetryChecker {

    public static void main(String[] args) {
        int[] parametros = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        int repetitions = 5;

        for (int n = 0; n < parametros.length; n++) {
            long[] times = new long[repetitions];
            long[] comparisonsArray = new long[repetitions];

            for (int rep = 0; rep < repetitions; rep++) {
                long startTime = System.nanoTime(); // Captura o tempo inicial

                int[][] matrix = new int[parametros[n]][parametros[n]]; // Corrigido para usar 'n'

                // Contadores de operações aritméticas e comparações
                Counter counter = new Counter();

                boolean isSymmetric = checkSymmetry(matrix, counter);

                long endTime = System.nanoTime(); // Captura o tempo final
                long timeElapsed = endTime - startTime; // Calcula o tempo decorrido

                times[rep] = timeElapsed;
                comparisonsArray[rep] = counter.comparisons;
            }

            // Calcula as médias
            long totalTime = 0;
            long totalComparisons = 0;
            for (int i = 0; i < repetitions; i++) {
                totalTime += times[i];
                totalComparisons += comparisonsArray[i];
            }
            long averageTime = totalTime / repetitions;
            long averageComparisons = totalComparisons / repetitions;

            // Exibe os resultados
            System.out.println("Matrix size: " + parametros[n] + "x" + parametros[n]);
            for (int i = 0; i < repetitions; i++) {
                System.out.println("Execução " + (i + 1) + ":");
                System.out.println("Tempo de execução em Nanosegundos: " + times[i]);
                System.out.println("Comparações: " + comparisonsArray[i]);
            }
            System.out.println("Média de tempo de execução em Nanosegundos: " + averageTime);
            System.out.println("Média de comparações: " + averageComparisons);
            System.out.println("--------------------------------");
        }
    }

    private static boolean checkSymmetry(int[][] matrix, Counter counter) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Verifica apenas metade da matriz
                counter.comparisons++;
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
                counter.operations++;
            }
        }
        return true;
    }

    static class Counter {
        long operations = 0;
        long comparisons = 0;
    }
}