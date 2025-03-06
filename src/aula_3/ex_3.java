public class ex_3 {
    public static void main(String[] args) {

        double matriz[][] = new double[10][10];

        for (int i = 0; i < 10; i++) {
            // int i = 0: Sigma rec + Sigma arm
            // i < 10: 2* Sigma rec + Sigma <
            // i++: 2 * Sigma rec + Sigma"+" + Sigma arm

            for (int j = 0; j < matriz[i].length; j++) {
            // int j = 0: Sigma rec + Sigma arm
            // j < 10: 2* Sigma rec + Sigma <
            // j++: 2 * Sigma rec + Sigma"+" + Sigma arm

                matriz[i][j] = -1;
                // matriz[i][j] = -1: 4 * Sigma rec + Sigma . + Sigma arm
        }
    }
}