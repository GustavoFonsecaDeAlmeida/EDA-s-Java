package eda17;

public class PesquisaSequencial {
    private No inicio;
    
    public PesquisaSequencial(No inicio) {
        this.inicio = inicio;
    }
    
    public No procura(int prioridade) {
        No temp = inicio;
        boolean achou = false;
        
        while ((temp != null) && (achou == false)) {
            if (temp.getPrio() == prioridade) {
                achou = true;
            }
            else {
                temp = temp.getProximo();
            }
        }
        return temp;
    }
}
