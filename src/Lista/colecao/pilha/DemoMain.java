package Lista.colecao.pilha;

import java.util.Stack;

public class DemoMain {

    public static void main(String[] args) {

        String[] parentes = {
                "(()()()())", // Balanceado
                "(((())))", // Balanceado
                "(()((())()))", // Balanceado
                "((((((())", // Não Balanceado
                "()))", // Não Balanceado
                "(()()(()" // Não Balanceado
        };

        for (String expressao : parentes) {
            Stack<Character> pilha = new Stack<>();
            boolean resultadoDaVez = true;

            for (char caractereAtual : expressao.toCharArray()) {
                if (caractereAtual == '(') {
                    pilha.push(caractereAtual);
                } else if (caractereAtual == ')') {
                    if (pilha.isEmpty()) {
                        resultadoDaVez = false;
                        break;
                    } else {
                        pilha.pop();
                    }
                }
            }

            if (!pilha.isEmpty()) {
                resultadoDaVez = false;
            }

            System.out.println("A expressão '" + expressao + "' está balanceada? " + resultadoDaVez);
        }
    }
}