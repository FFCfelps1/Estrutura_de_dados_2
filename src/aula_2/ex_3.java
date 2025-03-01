public class ex_3 {
    public static void main(String[] args) {
        int[] parametros = {10, 10, 50, 75, 100, 300, 500, 200, 1000, 1000, 5000, 7000, 10000, 1, 50000, 25000, 100000, 100000, 500000, 1000};
        int repetitions = 5;

        for (int tamanho = 0; tamanho < parametros.length; tamanho += 2) {
            long[] times = new long[repetitions];
            long[] operationsArray = new long[repetitions];
            long[] comparisonsArray = new long[repetitions];

            for (int rep = 0; rep < repetitions; rep++) {
                long startTime = System.nanoTime(); // Captura o tempo inicial

                // Criar uma matriz, baseado em valores dos parametros
                double matriz[][] = new double[parametros[tamanho]][parametros[tamanho + 1]];
                // Contadores de operações aritméticas e comparações
                long operations = 0;
                long comparisons = 0;

                // Limpar a matriz e colocar em todas as posições o valor -1
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = -1;
                        operations++; // Operação de atribuição
                        comparisons++; // Comparação do loop
                    }
                }

                long endTime = System.nanoTime(); // Captura o tempo final
                long timeElapsed = endTime - startTime; // Calcula o tempo decorrido

                times[rep] = timeElapsed;
                operationsArray[rep] = operations;
                comparisonsArray[rep] = comparisons;

                // Liberar memória
                matriz = null;
                System.gc();
            }

            // Calcula as médias
            long totalTime = 0;
            long totalOperations = 0;
            long totalComparisons = 0;
            for (int i = 0; i < repetitions; i++) {
                totalTime += times[i];
                totalComparisons += comparisonsArray[i];
            }
            long averageTime = totalTime / repetitions;
            long averageComparisons = totalComparisons / repetitions;

            // Exibe os resultados
            System.out.println("Tamanho: " + parametros[tamanho] + "x" + parametros[tamanho + 1]);
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
}