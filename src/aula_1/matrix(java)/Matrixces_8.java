// Exercise 8 this program will accept an input of a matrix  and the user, will define the size of the matrix, 
//and them the program will see if the matrix is a magic square or not. (ex: 3x3, 4x4, 5x5, etc)

import java.util.Scanner;

public class Matrixces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Enter the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Imprime matriz original
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpõe a matriz
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Imprime a matriz transposta
        System.out.println("Matriz Transposta:");
        printMatrix(transposedMatrix);

        // Verifica se a matriz é um quadrado mágico
        if (isMagicSquare(matrix, transposedMatrix)) {
            System.out.println("It is a magic square");
        } else {
            System.out.println("It is not a magic square");
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isMagicSquare(int[][] matrix, int[][] transposedMatrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != transposedMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}