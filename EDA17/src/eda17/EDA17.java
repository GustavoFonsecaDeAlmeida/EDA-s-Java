package eda17;

// Criação de uma lista ordenada utilizando uma lista duplamente encadeada
// com inclusões e exclusões em qualquer parte da lista

import java.util.Scanner;

public class EDA17 {
    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        System.out.println("1-Incluir");
        System.out.println("2-Excluir");
        System.out.println("3-Listar");
        System.out.println("4-Sair");
        System.out.print("Selecione a opção: ");
        opcao = teclado.nextInt();
        return opcao;
    }
    
    public static void incluir(ListaDupla lista) {
        Scanner teclado = new Scanner(System.in);
        No no = new No();
        
        System.out.print("Entre com o nome: ");
        no.setInfo(teclado.next());
        System.out.print("Entre com a prioridade: ");
        no.setPrio(teclado.nextInt());
        lista.inserir(no);
    }

    public static void excluir(ListaDupla lista) {
        Scanner teclado = new Scanner(System.in);
        PesquisaSequencial pesquisa = new PesquisaSequencial(lista.getInicio());
        int prio;
        No no;
        
        if (lista.vazia() == true) {
            System.out.println("Lista vazia");
            return;
        }
        
        System.out.print("Quem você quer excluir: ");
        prio = teclado.nextInt();
        no = pesquisa.procura(prio);
        if (no != null) {
            System.out.println("Excluir " + no.getInfo());
            lista.excluir(no);
        }
        else {
            System.out.println("No não foi encontrado");
        }
    }

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        int opcao;
        
        do {
            opcao = menu();
            switch (opcao) {
                case 1: incluir(lista); break;
                case 2: excluir(lista); break;
                case 3: 
                    System.out.println(lista.toString()); break;
                case 4: break;
                default: System.out.println("Erro: opção inválida");
            }
        } while (opcao != 4);
    }
}
