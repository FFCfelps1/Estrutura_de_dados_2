public class Main {

  public static void main(String[] args) {  
    //exercise1(args);
    //exercise2(args);
    exercise3(args);
  }

  // Exercise 1 do a program to include 100 numbers in a list and print them in the console
  public static void exercise1(String[] args) {
      System.out.println("Hello World");
      int[] numbers = new int[100];

      for (int i = 0; i < 100; i++) {
          numbers[i] = i;
          System.out.println(numbers[i]);
      }
  }
  
  // Exercise 2 do a program to include 100 numbers in a list and print them in the console, but if is multiple of 2 print 0
  public static void exercise2(String[] args) {
    int[] numbers = new int[100];

    for (int i = 0; i < 100; i++) {
      numbers[i] = i;
      if (numbers[i] % 2 == 0) {
        System.out.println(0);
      } else {
        System.out.println(numbers[i]);
      }
    }
  }

  // Exercise 3 do a program to include the letters of the alphabet in a list "A" to "Z" and print them in the console
  public static void exercise3(String[] args) {
    char[] alphabet = new char[26];
    char letter = 'A';

    for (int i = 0; i < 26; i++) {
      alphabet[i] = letter;
      System.out.println(alphabet[i]);
      letter++;
    }
  }

  // Exercise 4 do a program to include the letters of the alphabet in a list "A" to "Z" and them change one letter and one after, ex: A -> B, B -> A
  public static void exercise4(String[] args) {
    char[] alphabet = new char[26];
    char letter = 'A';

    for (int i = 0; i < 26; i++) {
      alphabet[i] = letter;
      System.out.println(alphabet[i]);
      letter++;
    }
  }
}