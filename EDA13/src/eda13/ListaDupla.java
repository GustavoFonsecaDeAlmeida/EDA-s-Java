package eda13;

public class ListaDupla {
    private No inicio, fim;
    
    public ListaDupla() {
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
            no.setAnterior(fim);
            fim.setProximo(no);
            fim = no;
        }
    }
    
    public Object excluir() {
        
        Object temp = inicio.getInfo();
        if (inicio == fim) {
            inicio = fim = null;
        }
        else {
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        }
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
