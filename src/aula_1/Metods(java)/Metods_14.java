import java.util.Scanner;

public class Metods_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] elementos = new double[10];

        // Load the array with 10 elements
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": ");
            elementos[i] = scanner.nextDouble();
        }

        int currentIndex = 0;
        char option;

        do {
            System.out.println("Menu:");
            System.out.println("Digite '+' para apresentar o próximo elemento do vetor");
            System.out.println("Digite '-' para apresentar o elemento anterior do vetor");
            System.out.println("Digite '.' para sair");
            option = scanner.next().charAt(0);

            switch (option) {
                case '+':
                    currentIndex = nextElement(currentIndex, elementos.length);
                    System.out.println("Elemento atual: " + elementos[currentIndex]);
                    break;
                case '-':
                    currentIndex = previousElement(currentIndex);
                    System.out.println("Elemento atual: " + elementos[currentIndex]);
                    break;
                case '.':
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != '.');

        scanner.close();
    }

    public static int nextElement(int currentIndex, int length) {
        if (currentIndex < length - 1) {
            return currentIndex + 1;
        } else {
            System.out.println("Você está no último elemento.");
            return currentIndex;
        }
    }

    public static int previousElement(int currentIndex) {
        if (currentIndex > 0) {
            return currentIndex - 1;
        } else {
            System.out.println("Você está no primeiro elemento.");
            return currentIndex;
        }
    }
}