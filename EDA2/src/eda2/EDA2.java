// Manipilação de pilha utilizando a classe Stack do Java

package eda2;

import java.util.Stack;

public class EDA2 {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        
        pilha.push('L');
        pilha.push('U');
        pilha.push('I');
        pilha.push('Z');
        
        
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
    } 
}
