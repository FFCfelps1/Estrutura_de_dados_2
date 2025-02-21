public class Main {

  public static void main(String[] args) {  
    //exercise6(args);
    exercise7(args);
    //exercise8(args);
    //exercise9(args);
    //exercise10(args);
  }
  //Exercise 6 do a program  with any matrix is possible to clean all the positions and than put -1 in all the positions
  public static void exercise6(String[] args) {
    int[][] matrix = new int[3][3];
    int rows = matrix.length;
    int columns = matrix[0].length;
    
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrix[i][j] = -1;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }