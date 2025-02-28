public class ex_3 {
    public static void main(String[] args) {
        int[] parametros = {10, 10, 50, 75, 100, 300, 500, 200, 1000, 1000, 5000, 7000, 10000, 1, 50000, 25000, 100000, 100000, 500000, 1000};
        for (int tamanho = 0; tamanho < parametros.length; tamanho += 2) {
            long startTime = System.nanoTime(); // Captura o tempo inicial

            // Criar uma matriz, baseado em valores dos parametros
            double matriz[][] = new double[parametros[tamanho]][parametros[tamanho + 1]];
            // Limpar a matriz e colocar em todas as posições o valor -1
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = -1;
                }
            }

            long endTime = System.nanoTime(); // Captura o tempo final
            long timeElapsed = endTime - startTime; // Calcula o tempo decorrido

            // Exibe o tempo de execução
            System.out.println("Tempo de execução para tamanho " + tamanho + " em Nanosegundos: " + timeElapsed);

            // Liberar memória
            matriz = null;
            System.gc();
        }
    }
}