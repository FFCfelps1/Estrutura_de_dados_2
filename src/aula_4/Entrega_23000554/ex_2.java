import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicialização de variáveis
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float media;
        float resultado = 0; // Inicializando a variável resultado

        // Calcula a soma dos elementos do vetor
        for(int i = 0; i < vetor.length; i++){
            resultado += vetor[i];
        }
        // Calcula a média
        media = resultado / vetor.length;

        System.out.println("The result is equal to: " + media);
        input.close();
    }
}