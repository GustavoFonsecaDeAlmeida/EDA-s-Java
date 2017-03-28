package eda12;

public class ListaSimples {
    private No topo;
    
    public ListaSimples() {
        topo = null;
    }
    
    public boolean vazia() {
        return (topo == null);
    }
    
    public Object peek() {
        return topo.getInfo();
    }
    
    public void inserir(No no) {
        if (vazia()) {
            topo = no;
        }
        else {
            no.setProximo(topo);
            topo = no;
        }
    }
    
    public Object excluir() {
        
        Object temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }
    
    @Override
    public String toString() {

        if (vazia()) {
            return "Pilha vazia";
        }
        No temp = topo;
        String mensagem = "";
        do {
            mensagem = mensagem + temp.getInfo() + " ";
            temp = temp.getProximo();
        } while (temp != null);
        return mensagem;
    }
}
