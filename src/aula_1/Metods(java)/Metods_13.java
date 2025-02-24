import java.util.Scanner;

class Pregos {
    double comprimento;
    double diametro;

    Pregos(double comprimento, double diametro) {
        this.comprimento = comprimento;
        this.diametro = diametro;
    }
}

public class Metods_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pregos[] amostras = new Pregos[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o comprimento do prego " + (i + 1) + ": ");
            double comprimento = scanner.nextDouble();
            System.out.println("Digite o diâmetro do prego " + (i + 1) + ": ");
            double diametro = scanner.nextDouble();
            amostras[i] = new Pregos(comprimento, diametro);
        }

        double somaComprimento = 0;
        double somaDiametro = 0;
        int indiceMaiorComprimento = 0;
        int indiceMenorDiametro = 0;

        for (int i = 0; i < 10; i++) {
            somaComprimento += amostras[i].comprimento;
            somaDiametro += amostras[i].diametro;

            if (amostras[i].comprimento > amostras[indiceMaiorComprimento].comprimento) {
                indiceMaiorComprimento = i;
            }

            if (amostras[i].diametro < amostras[indiceMenorDiametro].diametro) {
                indiceMenorDiametro = i;
            }
        }

        double comprimentoMedio = somaComprimento / 10;
        double diametroMedio = somaDiametro / 10;

        System.out.println("Comprimento Médio: " + comprimentoMedio + " mm");
        System.out.println("Diâmetro Médio: " + diametroMedio + " mm");
        System.out.println("Amostra mais longa: Prego " + (indiceMaiorComprimento + 1) + " com comprimento de " + amostras[indiceMaiorComprimento].comprimento + " mm");
        System.out.println("Amostra mais fina: Prego " + (indiceMenorDiametro + 1) + " com diâmetro de " + amostras[indiceMenorDiametro].diametro + " mm");

        scanner.close();
    }
}