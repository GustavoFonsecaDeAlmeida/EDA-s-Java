package eda16;

// Criação de uma fila de prioridades utilizando uma 
// lista duplamente encadeada

public class EDA16 {
    public static void main(String[] args) {
        ListaDupla fila = new ListaDupla();
        
        fila.inserir(new No("Luiz", 9));
        System.out.println(fila.toString());
        fila.inserir(new No("Maria", 5));
        System.out.println(fila.toString());
        fila.inserir(new No("Felipe", 7));
        System.out.println(fila.toString());
        fila.inserir(new No("Joao", 15));
        System.out.println(fila.toString());
        
        while (fila.vazia() == false) {
            fila.excluir();
            System.out.println(fila.toString());
        }  
        
        fila.inserir(new No("Luiz", 9));
        System.out.println(fila.toString());
    }
}
