// Exercise 10, this program is to manage a theater with 100 seats and 30 rows, the user can choose the seat and the row
// To choose, the program will print the seats and the rows, with this code (0)free seat, (1)sold seat, and (2)reserved seat

import java.util.Scanner;

public class Matrixces_9 {
    public static void main(String[] args) {
        int rows = 30;
        int seats = 100;
        int[][] theater = new int[rows][seats];

        Scanner input = new Scanner(System.in);

        do {
            printMatrix(theater);

            System.out.println("Choose a seat: ");
            int seat = input.nextInt();
            System.out.println("Choose a row: ");
            int row = input.nextInt();

            if (row == -1 || seat == -1) {
                System.out.println("Exit");
                break;
            }

            if (theater[row][seat] == 0) {
                System.out.println("The seat is free\nDo you want to buy/reserve it? (1 - Buy\n2 - Reserve)");
                int option = input.nextInt();

                if (option == 1) {
                    theater[row][seat] = 1;
                    System.out.println("The seat was bought successfully");
                } else if (option == 2) {
                    theater[row][seat] = 2;
                    System.out.println("The seat was reserved successfully");
                }
            } else if (theater[row][seat] == 1) {
                System.out.println("The seat is sold");
            } else if (theater[row][seat] == 2) {
                System.out.println("The seat is reserved");
            }
        } while (true);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println();
        }
    }
}