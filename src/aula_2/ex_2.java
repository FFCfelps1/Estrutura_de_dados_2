public class ex_2{
    public static void main(String[] args){
        int[] parametros = {10, 50, 100, 500, 1000, 5000, 10000, 100000, 500000};
        for (int tamanho : parametros){
            int[] array_test = new int[parametros[tamanho]];
            int[] array_copy = new int[parametros[tamanho]];
            for (int j : array_test){
                array_copy[j] = array_test[j];
            }
        }
    }
}