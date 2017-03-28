package eda18;

public class PesquisaSequencial {
    private int[] vet;

    public PesquisaSequencial(int[] vet) {
        this.vet = vet;
    }
    
    public int procura(int elem) {
        int pos = 0;
        boolean achou = false;
        
        while ((pos < vet.length) && (achou == false)) {
            if (vet[pos] == elem) {
                achou = true;
            }
            else {
                pos++;
            }
        }
        if (achou == true)
            return pos;
        else 
            return -1;
    }
}