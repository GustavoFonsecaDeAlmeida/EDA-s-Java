package eda14;

public class ListaDupla {
    private No topo;
    
    public ListaDupla() {
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
            topo.setAnterior(no);
            topo = no;
        }
    }
    
    public Object excluir() {
        
        Object temp = topo.getInfo();
        if ((topo.getProximo() == null) && (topo.getAnterior() == null)) {
            topo = null;
        }
        else {
            topo = topo.getProximo();
            topo.setAnterior(null);
        }
        return temp;
    }
    
    @Override
    public String toString() {

        if (vazia()) {
            return "Lista vazia";
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