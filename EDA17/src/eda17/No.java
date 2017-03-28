package eda17;

public class No {
    private Object info;
    private int prioridade;
    private No anterior;
    private No proximo;
    
    public No(Object info, int prioridade, No proximo, No anterior) {
        this.info = info;
        this.prioridade = prioridade;
        this.anterior = anterior;
        this.proximo = proximo;
    }
    
    public No(Object info, int prioridade) {
        this.info = info;
        this.prioridade = prioridade;
        this.anterior = null;
        this.proximo = null;
    }
    
    public No() {
        this.anterior = null;
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
    
        
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    
    public No getAnterior() {
        return anterior;
    }
    
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    public No getProximo() {
        return proximo;
    }
}