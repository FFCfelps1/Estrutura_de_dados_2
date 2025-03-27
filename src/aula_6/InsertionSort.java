public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //2 + 3*(n + 1) + 4n operações

            int key = array[i];
            // 4n operações
            int j = i - 1;
            // 4n operações

            while (j >= 0 && array[j] > key) {
                // 4*(n+1) + 5*(n+1) operações

                array[j + 1] = array[j];
                // 4n + 3n operações

                j = j - 1;
                // 4n operações
            }
            array[j + 1] = key;
            // 5n operações
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Array antes da ordenacao:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        insertionSort(array);

        System.out.println("\n\nArray depois a ordenacao:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}