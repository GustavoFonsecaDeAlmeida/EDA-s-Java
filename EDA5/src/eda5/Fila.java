package eda5;

public class Fila {
    private Object[] fila;
    private int inicio;
    private int fim;
    private int tamFila;
    
    public Fila(int tam) {
        tamFila = tam;
        fila = new Object[tamFila];
        inicio = fim = -1;
    }
    
    public boolean vazia() {
        return (inicio == -1);
    }
    
    public boolean cheia() {
        return (fim == (tamFila-1));
    }
    
    public void incluir(Object elem) {
        if (cheia() == false) {
            if (vazia() == true) {
                inicio = fim = 0;
                fila[fim] = elem;
            }
            else {
                fila[++fim] = elem;
            }
        }
        else {
            System.out.println("Erro: fila cheia");
        }
    }
    
    public Object excluir() {
        Object temp;
        
        if (vazia() == false) {
            temp = fila[inicio];
            for (int i = 0; i < fim; i++) {
                fila[i] = fila[i+1];
            }
            fim--;
            if (fim == -1) {
                inicio = -1;
            }
            return temp;
        }
        else {
            System.out.println("Erro: fila vazia");
            return null;
        }
    }
    
    public String toString() {
        String retorno = "";
        
        if (vazia() == false) {
            for (int i = inicio; i <= fim; i++) {
                retorno += fila[i];
                retorno += " ";
            }
        }
        else {
            System.out.println("Erro: fila vazia");
        }
        return retorno;
    }
}
