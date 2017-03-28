package eda11;

// Criação de uma fila utilizando uma lista simplemente encadeada

public class EDA11 {
    public static void main(String[] args) {
        ListaSimples fila = new ListaSimples();
        
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
