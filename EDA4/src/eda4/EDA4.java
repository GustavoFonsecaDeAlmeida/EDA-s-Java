// Implementação de fila utilizando a initerface Queue

package eda4;

import java.util.Queue;
import java.util.LinkedList;

public class EDA4 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Gustavo");
        fila.add("Isaias");
        fila.add("Gabriel");
        
        System.out.println(fila.element()); // Retorna o primeiro da fila
        System.out.println(fila.peek()); // Retorna o primeiro da fila
        
        System.out.println(fila);
        fila.remove(); // Remove o primeiro elemento da fila
        System.out.println(fila);
        fila.remove(); // Remove o primeiro elemento da fila
        System.out.println(fila);
        
        System.out.println(fila.isEmpty());
    }
}
