package eda19;

public class PesquisaBinaria {
    private int[] vet;

    public PesquisaBinaria(int[] vet) {
        this.vet = vet;
    }
    
    public int procura(int elem) {
        int inicio = 0, fim = (vet.length - 1), meio = 0;
        boolean achou = false;
        
        while ((inicio <= fim) && (achou == false)) {
            meio = (inicio + fim) / 2;
            if (vet[meio] == elem) {
                achou = true;
            }
            else if (vet[meio] > elem ) {
                fim = meio - 1;
            }
            else {
                inicio = meio + 1;
            }
        }
        if (achou == true)
            return meio;
        else 
            return -1;
    }
}