package eda12;

// Criação de uma pilha utilizando uma lista simplemente encadeada

public class EDA12 {
    public static void main(String[] args) {
        ListaSimples pilha = new ListaSimples();
        
        pilha.inserir(new No("Luiz"));
        System.out.println(pilha.peek());
        pilha.inserir(new No("Maria"));
        System.out.println(pilha.toString());
        pilha.inserir(new No("Felipe"));
        System.out.println(pilha.toString());
        pilha.inserir(new No("Joao"));
        System.out.println(pilha.toString());
        
        while (pilha.vazia() == false) {
            pilha.excluir();
            System.out.println(pilha.toString());
        }  
        
        pilha.inserir(new No("Luiz"));
        System.out.println(pilha.toString());
    }
}
