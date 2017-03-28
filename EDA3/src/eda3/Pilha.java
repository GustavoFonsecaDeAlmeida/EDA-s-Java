package eda3;

public class Pilha {
    int tamPilha;
    Object pilha[];
    int topo;
    
    Pilha(int tam) {
        tamPilha = tam;
        pilha = new Object[tamPilha];
        topo = -1;
    }
    
    void push(Object elem) {
        if (pilhaCheia() == false) {
            topo++;
            pilha[topo] = elem;
        }
    }
    
    Object pop() {
        Object elem;
        
        if (pilhaVazia() == false) {
            elem = pilha[topo];
            topo--;
            return elem;
        }
        else {
            return -1;
        }
    }
    
    boolean pilhaVazia() {
        return topo == -1;
    }
    
    boolean pilhaCheia() {
        return topo == (tamPilha-1);
    }       
    
    public String toString() {
        String saida = "";
        
        for (int i = 0; i < topo; i++) {
            saida += pilha[i];
        }
        return saida;
    }
}
