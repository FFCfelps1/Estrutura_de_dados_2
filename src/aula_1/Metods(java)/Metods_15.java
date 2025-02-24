import java.util.Scanner;

public class Metods_15 {
    private static int numeroSecreto = -1;
    private static int contadorPalpites = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;

        do {
            System.out.println("Menu:");
            System.out.println("A- Inserir número secreto");
            System.out.println("B- Jogar");
            System.out.println("C- Apresentar resultados");
            System.out.println("D- Sair");
            option = scanner.next().charAt(0);

            switch (option) {
                case 'A':
                case 'a':
                    inserirNumeroSecreto(scanner);
                    break;
                case 'B':
                case 'b':
                    jogar(scanner);
                    break;
                case 'C':
                case 'c':
                    apresentarResultados();
                    break;
                case 'D':
                case 'd':
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 'D' && option != 'd');

        scanner.close();
    }

    private static void inserirNumeroSecreto(Scanner scanner) {
        System.out.println("Digite um número inteiro e positivo como número secreto:");
        numeroSecreto = scanner.nextInt();
        while (numeroSecreto <= 0) {
            System.out.println("Número inválido. Digite um número inteiro e positivo:");
            numeroSecreto = scanner.nextInt();
        }
        System.out.println("Número secreto inserido com sucesso.");
    }

    private static void jogar(Scanner scanner) {
        if (numeroSecreto == -1) {
            System.out.println("Primeiro insira um número secreto (opção A).");
            return;
        }

        contadorPalpites = 0;
        int palpite;

        System.out.println("Digite um número inteiro e positivo para adivinhar o número secreto:");
        while (true) {
            palpite = scanner.nextInt();
            if (palpite < 0) {
                System.out.println("Número negativo. Retornando ao menu principal.");
                return;
            }
            contadorPalpites++;
            if (palpite > numeroSecreto) {
                System.out.println("ALTO");
            } else if (palpite < numeroSecreto) {
                System.out.println("BAIXO");
            } else {
                System.out.println("ACERTOU");
                return;
            }
        }
    }

    private static void apresentarResultados() {
        if (contadorPalpites == 0) {
            System.out.println("Nenhum jogo foi jogado ainda.");
        } else {
            System.out.println("Quantidade de palpites necessários para o último acerto: " + contadorPalpites);
        }
    }
}