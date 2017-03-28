package eda15;

public class No {
    private Object info;
    private int prioridade;
    private No proximo;
    
    public No(Object info, int prioridade, No proximo) {
        this.info = info;
        this.prioridade = prioridade;
        this.proximo = proximo;
    }
    
    public No(Object info, int prioridade) {
        this.info = info;
        this.prioridade = prioridade;
        this.proximo = null;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
    
    public Object getInfo() {
        return info;
    }
 
    public void setPrio(int prioridade) {
        this.prioridade = prioridade;
    }
    
    public int getPrio() {
        return prioridade;
    }
    
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    public No getProximo() {
        return proximo;
    }
}