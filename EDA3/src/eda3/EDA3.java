// Implementação da classe Pilha

package eda3;

public class EDA3 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(50);
        String palavra = "Felicidade";
        
        for (int i = 0; i < palavra.length(); i++) {
           pilha.push(palavra.charAt(i));
        }
        
        System.out.println(pilha.toString());
        
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(pilha.pop());
        }
        System.out.println("");
    }
}
