package eda10;

// Manipulação de listas utilizando a classe LinkedList
// do Java

import java.util.LinkedList;

public class EDA10 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        
        lista.add("Luiz");
        System.out.println(lista);
        lista.add(0, "Ana");
        System.out.println(lista);
        lista.add("Maria");
        System.out.println(lista);        
        lista.add("Felipe");
        System.out.println(lista);
        
        System.out.println(lista.peekFirst());
        System.out.println(lista.peekLast());
        lista.set(0, "Fabiana");
        System.out.println(lista);
        System.out.println(lista.get(2));
        lista.poll();
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        System.out.println(lista.contains("Maria"));
        System.out.println(lista.isEmpty());
        System.out.println(lista.indexOf("Maria"));
        System.out.println(lista.size());
    }
}