// Implementação de fila de prioridade utilizando as
// classes do Java

package eda9;

import java.util.PriorityQueue;

public class EDA9 {
    public static void main(String[] args) {
        PriorityQueue<Elemento> filaPrio = new PriorityQueue<>();
        
        filaPrio.add("Luiz");
        System.out.println(filaPrio);
        filaPrio.add("Ana");
        System.out.println(filaPrio);
        filaPrio.add("Maria");
        System.out.println(filaPrio);
        filaPrio.add("Felipe");
        System.out.println(filaPrio);
        filaPrio.add("Ana");
        System.out.println(filaPrio);
        
        while (filaPrio.isEmpty() == false) {
            // Consulta o primeiro elemento da fila
            System.out.println(filaPrio.peek());
            // Exclui o primeiro elemento da fila
            System.out.println(filaPrio.poll());
            // Verifica se a fila está vazia
        }
    }
}