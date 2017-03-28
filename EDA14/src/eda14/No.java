package eda14;

public class No {
    private Object info;
    private No proximo;
    private No anterior;
    
    public No(Object info, No proximo, No anterior) {
        this.info = info;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    
    public No(Object info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public void setInfo(Object info) {
        this.info = info;
    }
    
    public Object getInfo() {
        return info;
    }
    
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    public No getProximo() {
        return proximo;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    
    public No getAnterior() {
        return anterior;
    }
}