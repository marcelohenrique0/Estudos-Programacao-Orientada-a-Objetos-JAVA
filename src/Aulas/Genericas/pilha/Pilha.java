package Aulas.Genericas.pilha;

import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<>(); //classe number serve para qualquer tipo numerico

        System.out.println(pilha);
        pilha.push(22);
        
        System.out.println(pilha);
        pilha.push(33.21F);
        
        System.out.println(pilha);
        pilha.push(27.232577);

        System.out.println(pilha);

        System.out.println("Remove o elemento: " + pilha.pop());

        System.out.println("Remove o elemento: " + pilha.pop());
        
        System.out.println("Remove o elemento: " + pilha.pop());


    }

}
