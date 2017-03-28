package eda16;

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
            No temp = inicio;
            while ((temp != null) && (temp.getPrio() > no.getPrio())) {
                temp = temp.getProximo();
            }
            if (temp == inicio) { // Inclusão no início
                no.setProximo(inicio);
                temp.setAnterior(no);
                inicio = no;
            }
            else if (temp != null) { // Inclusão no meio
                no.setProximo(temp);
                no.setAnterior(temp.getAnterior());
                temp.getAnterior().setProximo(no);
                temp.setAnterior(no);
            }
            else { // Inclusão no fim
                no.setAnterior(fim);
                fim.setProximo(no);
                fim = no;
            }
        }
    }
    
    public Object excluir() {
        
        Object temp = inicio.getInfo();
        if (inicio == fim) { // Exclusão do último elemento da fila
            inicio = fim = null;
        }
        else { // Exclusão quando temos pelo menos dois elementos na fila
            inicio = inicio.getProximo(); 
            inicio.setAnterior(null);
        }
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
