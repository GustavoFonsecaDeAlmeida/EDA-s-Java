// Implementação da classe Fila utilizando vetor
// Exclusão a partir do algoritmo do relógio ou fila circular

package eda6;

public class EDA6 {
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
        System.out.println(elem);
        System.out.println(fila.toString());
        fila.incluir("Antonio");
        System.out.println(fila.toString());
        fila.incluir("Gustavo");
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(fila.toString());
        elem = fila.excluir();
        System.out.println(fila.toString());    }
}