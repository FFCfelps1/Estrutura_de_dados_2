public class ex_1 {
    public static void main(String[] args) {
        int[] parametros = {10, 50, 100, 500, 1000, 5000, 10000, 100000, 500000};
        int repetitions = 5;

        for (int tamanho : parametros) {
            long[] times = new long[repetitions];
            long[] operationsArray = new long[repetitions];
            long[] comparisonsArray = new long[repetitions];

            for (int rep = 0; rep < repetitions; rep++) {
                long startTime = System.nanoTime(); // Captura o tempo inicial

                // Cria um array com o tamanho atual (tamanho)
                int[] array_test = new int[tamanho];

                // Contadores de operações aritméticas e comparações
                long operations = 0;
                long comparisons = 0;

                // Preenche o array com zeros
                for (int j = 0; j < array_test.length; j++) {
                    array_test[j] = 0;
                    operations++; // Operação de atribuição
                    comparisons++; // Comparação do loop
                }

                long endTime = System.nanoTime(); // Captura o tempo final
                long timeElapsed = endTime - startTime; // Calcula o tempo decorrido

                times[rep] = timeElapsed;
                operationsArray[rep] = operations;
                comparisonsArray[rep] = comparisons;
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
            System.out.println("Tamanho: " + tamanho);
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