package eda12;

public class No {
    private Object info;
    private No proximo;
    
    public No(Object info, No proximo) {
        this.info = info;
        this.proximo = proximo;
    }
    
    public No(Object info) {
        this.info = info;
        this.proximo = null;
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
}