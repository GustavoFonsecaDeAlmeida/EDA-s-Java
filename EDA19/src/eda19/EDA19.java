package eda19;

import java.util.Scanner;

public class EDA19 {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80};
        Scanner teclado = new Scanner(System.in);
        PesquisaBinaria pesquisa = new PesquisaBinaria(vetor);
        
        System.out.print("Entre com um número: ");
        int num = teclado.nextInt();
        int pos = pesquisa.procura(num);
        if (pos == -1) {
            System.out.println("Elemento não encontrado");
        }
        else {
            System.out.println("Elemento encontrado na posição " + pos);
        }
    }
}
