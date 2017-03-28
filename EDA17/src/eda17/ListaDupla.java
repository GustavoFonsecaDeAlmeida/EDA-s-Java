package eda17;

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
    
    public No getInicio() {
        return inicio;
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
    
    public Object excluir(No no) {
        
        Object temp = inicio.getInfo();
        if (inicio == fim) { // Exclusão do último elemento da lista
            inicio = fim = null;
        }
        else if (no == inicio) { // Exclusão do primeiro da lista
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        }
        else if (no == fim) { // Exclusão no final da lista
            fim = fim.getAnterior();
            fim.setProximo(null);
        }
        else { // Exclusão no meio da lista
            No noAnterior = no.getAnterior();
            noAnterior.setProximo(no.getProximo());
            No noProximo = no.getProximo();
            noProximo.setAnterior(no.getAnterior());
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
            mensagem = mensagem + temp.getInfo() + "/" + temp.getPrio() + " ";
            temp = temp.getProximo();
        } while (temp != null);
        return mensagem;
    }
}
