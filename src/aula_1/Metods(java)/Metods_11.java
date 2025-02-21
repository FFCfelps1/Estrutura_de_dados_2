import java.util.Scanner;

public class Metods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the values of a, b and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("There are no real roots");
            //Need a treat to became an imaginary number    
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("The roots are: " + x1 + " and " + x2);
        }
    }
}