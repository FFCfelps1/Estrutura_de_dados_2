/*Este programa tem como objetivo de fazer várias listas e ver quanto
 * tempo demora para criar as listas e substituir todos os valores
 * para dentro dela.
 */


 public class ex_1 {
    public static void main(String[] args) {
        int[] parametros = {10, 50, 100, 500, 1000, 5000, 10000, 100000, 500000};

        // Loop para iterar sobre os valores de parametros
        for (int tamanho = 0; tamanho< parametros.length; tamanho++) {
            long startTime = System.nanoTime(); // Captura o tempo inicial

            // Cria um array com o tamanho atual (tamanho)
            int[] array_test = new int[tamanho];

            // Preenche o array com zeros
            for (int j = 0; j < array_test.length; j++) {
                array_test[j] = 0;
            }

            long endTime = System.nanoTime(); // Captura o tempo final
            long timeElapsed = endTime - startTime; // Calcula o tempo decorrido

            // Exibe o tempo de execução
            System.out.println("Tempo de execução para tamanho em Nanosegundos: " + timeElapsed);
        }
    }
}