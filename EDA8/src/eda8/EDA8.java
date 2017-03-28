// Implementação da classe Fila de Prioridades utilizando vetor
// Inclusão e exclusão a partir de cópias de elementos

package eda8;

public class EDA8 {
    public static void main(String[] args) {
        FilaPrio fila = new FilaPrio(4);
        
        fila.incluir(new Elemento("Luiz", 9));
        System.out.println(fila.toString());
        fila.incluir(new Elemento("Ana", 15));
        System.out.println(fila.toString());
        fila.incluir(new Elemento("Pedro", 20));
        System.out.println(fila.toString());
        fila.incluir(new Elemento("Joao", 17));
        System.out.println(fila.toString());
        fila.excluir();
        System.out.println(fila.toString());
    }
}
