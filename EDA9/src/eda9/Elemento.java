package eda9;

public class Elemento {
    private String nome;
    private int prio;
    
    public Elemento(String nome, int prio) {
        this.nome = nome;
        this.prio = prio;
    }
    
    public int getPrio() {
        return prio;
    }
    
    public String toString() {
        return nome + "/" + prio;
    }
}
