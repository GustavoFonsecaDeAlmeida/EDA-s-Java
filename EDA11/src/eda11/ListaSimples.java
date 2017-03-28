package eda11;

public class ListaSimples {
    private No inicio, fim;
    
    public ListaSimples() {
        inicio = fim = null;
    }
    
    public boolean vazia() {
        return (inicio == null);
    }
    
    public Object peek() {
        return inicio.getInfo();
    }
    
    public void inserir(No no) {
        if (vazia()) {
            inicio = fim = no;
        }
        else {
            fim.setProximo(no);
            fim = no;
        }
    }
    
    public Object excluir() {
        
        Object temp = inicio.getInfo();
        inicio = inicio.getProximo();
        return temp;
    }
    
    @Override
    public String toString() {

        if (vazia()) {
            return "Lista vazia";
        }
        No temp = inicio;
        String mensagem = "";
        do {
            mensagem = mensagem + temp.getInfo() + " ";
            temp = temp.getProximo();
        } while (temp != null);
        return mensagem;
    }
}
