package eda18;

import java.util.Scanner;

public class EDA18 {
    public static void main(String[] args) {
        int[] vetor = {50, 10, 20, 100, 30, 70, 5, 15};
        Scanner teclado = new Scanner(System.in);
        PesquisaSequencial pesquisa = new PesquisaSequencial(vetor);
        
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
