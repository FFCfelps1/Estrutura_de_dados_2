import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicialização de variáveis
        int resultado = 1;
        int a;

        System.out.println("Enter the value of a factorial: ");
        a = input.nextInt();

        // loop para fazer fatorial
        for(int i = a; i > 0; i--){
            resultado = resultado * i;
        }

        System.out.println("The result is equal to: " + resultado);
        input.close();
    }
}