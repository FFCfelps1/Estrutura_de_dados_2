public class ex_2 {
    public static void main(String[] args) {

        int[] array_test = new int[10];
        int[] array_copy = new int[10];

        for (int j = 0; j < 10; j++) {
            // int j = 0: Sigma rec + Sigma arm
            // 2
            // j < 10: 2* Sigma rec + Sigma <
            // 3
            // j++: 2 * Sigma rec + Sigma"+" + Sigma arm
            // 4

            array_copy[j] = array_test[j];
            //array_test[j] lado direito: 3 * Sigma rec + Sigma .
            // 4
            //array_copy[j] lado esquerdo: 2 * Sigma rec + Simga . + Sigma arm
            // 4
        }
    }
}

/*
10 : 170
50 : 850
100 : 1700
500 : 8500
1000 : 17000
5000 : 85000
10000 : 170000
50000 : 850000
100000 : 1700000
500000 : 8500000
*/