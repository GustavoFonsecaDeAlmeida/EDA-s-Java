package eda15;

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
            No temp = inicio;
            No ant = inicio;
            while ((temp != null) && (temp.getPrio() < no.getPrio())) {
                ant = temp;
                temp = temp.getProximo();
            }
            if (temp == inicio) { // Inclusão no início
                no.setProximo(inicio);
                inicio = no;
            }
            else if (temp != null) { // Inclusão no meio
                ant.setProximo(no);
                no.setProximo(temp);
            }
            else { // Inclusão no fim
                ant.setProximo(no);
            }
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
            return "Fila vazia";
        }
        No temp = inicio;
        String mensagem = "";
        do {
            mensagem = mensagem + temp.getInfo() + "/" + temp.getPrio() + " ";
            temp = temp.getProximo();
        } while (temp != null);
        return mensagem;
    }
}
