// Implementação de fila de prioridade utilizando as
// classes do Java

package eda9;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EDA9 {
    public static void main(String[] args) {
        Comparator<Elemento> comparator = new ComparaElemento();
        PriorityQueue<Elemento> filaPrio = new PriorityQueue<>(comparator);
        
        filaPrio.add(new Elemento("Luiz", 9));
        System.out.println(filaPrio);
        filaPrio.add(new Elemento("Ana", 15));
        System.out.println(filaPrio);
        filaPrio.add(new Elemento("Maria", 20));
        System.out.println(filaPrio);
        filaPrio.add(new Elemento("Felipe", 7));
        System.out.println(filaPrio);
        
        while (filaPrio.isEmpty() == false) {
            System.out.println(filaPrio.poll());
        }
    }
}