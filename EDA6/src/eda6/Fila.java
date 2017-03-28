package eda6;

public class Fila {
    private Object[] fila;
    private int inicio;
    private int fim;
    final private int tamFila;
    
    public Fila(int tam) {
        tamFila = tam;
        fila = new Object[tamFila];
        inicio = fim = -1;
    }
    
    public boolean vazia() {
        return (inicio == -1);
    }
    
    public boolean cheia() {
        return ((inicio == 0 && fim == (tamFila-1)) || (fim == inicio-1));
    }
    
    private int inc(int i) {
        if (i == (tamFila-1))
            return 0;
        else
            return (i+1);
    }
    
    public void incluir(Object elem) {
        if (cheia() == false) {
            if (vazia() == true) {
                inicio = fim = 0;
                fila[fim] = elem;
            }
            else {
                fim = inc(fim);
                fila[fim] = elem;
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
            
            if (inicio == fim)
                inicio = fim = -1;
            else
                inicio = inc(inicio);
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
            if (inicio <= fim)
                for (int i = inicio; i <= fim; i++) {
                    retorno += fila[i];
                    retorno += " ";
                }
            else {
                for (int i = inicio; i < tamFila; i++) {
                    retorno += fila[i];
                    retorno += " ";
                }    
                for (int i = 0; i <= fim; i++) {
                    retorno += fila[i];
                    retorno += " ";
                }    
            }
        }
        else {
            System.out.println("Erro: fila vazia");
        }
        return retorno;
    }
}