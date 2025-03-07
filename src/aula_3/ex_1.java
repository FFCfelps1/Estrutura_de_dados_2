public class ex_1 {
    public static void main(String[] args) {

        int[] array_test = new int[10];

        // Preenche o array com zeros
        for (int j = 0; j < 10; j++) {
            // int j = 0: Sigma rec + Sigma arm
            // 2
            // j < 10: 2* Sigma rec + Sigma <
            // 3
            // j++: 2 * Sigma rec + Sigma"+" + Sigma arm
            // 4

            array_test[j] = 0;
            //array_test[j] = 0: 3 * Sigma rec + Sigma . + Sigma arm
            // 5
        }
}
/*
10 : 140
50 : 700
100 : 1400
500 : 7000
1000 : 14000
5000 : 70000
10000 : 140000
50000 : 700000
100000 : 1400000
500000 : 7000000
*/
