public class ex_2 {
    public static void main(String[] args) {
        int[] parametros = {10, 50, 100, 500, 1000, 5000, 10000, 100000, 500000};
        for (int tamanho = 0; tamanho < parametros.length; tamanho++) {
            long startTime = System.nanoTime(); // Captura o tempo inicial

            int[] array_test = new int[tamanho];
            int[] array_copy = new int[tamanho];
            for (int j = 0; j < array_test.length; j++) {
                array_copy[j] = array_test[j];
            }

            long endTime = System.nanoTime(); // Captura o tempo final
            long timeElapsed = endTime - startTime; // Calcula o tempo decorrido

            // Exibe o tempo de execução
            System.out.println("Tempo de execução para tamanho " + tamanho + " em Nanosegundos: " + timeElapsed);
        }
    }
}