package Empilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
//
//        pilha.push("Kaiky");
//
//        System.out.println(pilha);
//
//        pilha.push("Jamilli");
//
//        System.out.println(pilha);
//
//        System.out.println(pilha);
//        System.out.println(pilha.vazia());

        Stack<String> stack = new Stack<String>();
        stack.push("Jamilli, kaiky");
        stack.push("Kaiky");
        stack.push("jamiliky");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);

        String nome = stack.peek();
        System.out.println(nome);

        System.out.println(stack);
    }

}
