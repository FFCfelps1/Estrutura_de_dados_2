public class ex_2 {
    public static void main(String[] args) {

        int[] array_test = new int[10];
        int[] array_copy = new int[10];

        for (int j = 0; j < 10; j++) {
            // int j = 0: Sigma rec + Sigma arm
            // j < 10: 2* Sigma rec + Sigma <
            // j++: 2 * Sigma rec + Sigma"+" + Sigma arm

            array_copy[j] = array_test[j];
            //array_test[j] lado direito: 3 * Sigma rec + Sigma .
            //array_copy[j] lado esquerdo: 2 * Sigma rec + Simga . + Sigma arm
        }
    }
}