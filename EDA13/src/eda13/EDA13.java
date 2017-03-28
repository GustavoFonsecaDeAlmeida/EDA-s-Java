package eda13;

// Criação de uma fila utilizando uma lista duplamente encadeada

public class EDA13 {
    public static void main(String[] args) {
        ListaDupla fila = new ListaDupla();
        
        fila.inserir(new No("Luiz"));
        System.out.println(fila.peek());
        fila.inserir(new No("Maria"));
        System.out.println(fila.toString());
        fila.inserir(new No("Felipe"));
        System.out.println(fila.toString());
        fila.inserir(new No("Joao"));
        System.out.println(fila.toString());
        
        while (fila.vazia() == false) {
            fila.excluir();
            System.out.println(fila.toString());
        }  
        
        fila.inserir(new No("Luiz"));
        System.out.println(fila.toString());
    }
}
