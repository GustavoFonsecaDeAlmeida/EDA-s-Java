package eda8;

public class FilaPrio {
    private Object[] fila;
    private int inicio;
    private int fim;
    private int tamFila;
    
    public FilaPrio(int tam) {
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
        elem = (Elemento) elem;
        
        if (cheia() == false) {
            if (vazia() == true) {
                inicio = fim = 0;
                fila[fim] = elem;
            }
            else {
                // Pesquisa o local da inclusão
                int i = 0;
                boolean achou = false;
                do {
                    if (elem.getPrio() > fila[i].getPrio()) {
                        achou = true;
                    }
                    else {
                        i++;
                    }
                } while (achou == false);
                // Desloca os elementos para direita, se necessário
                for (int j = fim; j >= i; j--) {
                    fila[j+1] = fila[j];
                }
                // Inseri o elemento
                fila[i] = elem;
                // Incrementa o final da fila
                fim++;
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
    
    @Override
    public String toString() {
        String retorno = "";
        
        if (vazia() == false) {
            for (int i = inicio; i <= fim; i++) {
                retorno += fila[i].toString();
                retorno += " ";
            }
        }
        else {
            System.out.println("Erro: fila vazia");
        }
        return retorno;
    }
}
