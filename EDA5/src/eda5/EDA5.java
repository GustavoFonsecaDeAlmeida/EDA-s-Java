// Implementação da classe Fila utilizando vetor
// Exclusão a partir de cópias de elementos

package eda5;

public class EDA5 {
    public static void main(String[] args) {
        Fila fila = new Fila(4);
        Object elem;
        
        fila.incluir("Luiz");
        fila.incluir("Maria");
        fila.incluir("Pedro");
        fila.incluir("Joao");
        fila.incluir("Fabiana");
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(elem);
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(fila.toString());
    }
}
