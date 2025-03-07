public class ex_3 {
    public static void main(String[] args) {

        double matriz[][] = new double[10][10];

        for (int i = 0; i < 10; i++) {
            // int i = 0: Sigma rec + Sigma arm
            // 2
            // i < 10: 2* Sigma rec + Sigma <
            // 3
            // i++: 2 * Sigma rec + Sigma"+" + Sigma arm
            // 4

            for (int j = 0; j < matriz[i].length; j++) {
            // int j = 0: Sigma rec + Sigma arm
            // 2
            // j < 10: 2* Sigma rec + Sigma <
            // 3
            // j++: 2 * Sigma rec + Sigma"+" + Sigma arm
            // 4
            matriz[i][j] = -1;
            // matriz[i][j] = -1: 4 * Sigma rec + Sigma . + Sigma arm
            // 6
        }
    }
}
/*
10x10: 2400
50x75: 90000
100x300: 720000
500x200: 2400000
1000x1000: 24000000
5000x7000: 840000000
10000x1: 240000
50000x25000: 30000000000
100000x100000: 240000000000
500000x1000: 12000000000
*/