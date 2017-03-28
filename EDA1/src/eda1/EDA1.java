// Manipulação de matriz

package eda1;

public class EDA1 {

    public static void main(String[] args) {
        final int NUMLINHA = 4;
        final int NUMCOLUNA = 5;
        int matriz[][] = { {1,2,3,4,5}, {6,7,8,9,10}, 
            {11,12,13,14,15}, {16,17,18,19,20} };
        
        for (int[] matriz1 : matriz) {
            for (int matriz2 : matriz1) {
                System.out.printf("%3d", matriz[matriz2]);
            }
            System.out.println("");
        }
    }
}
