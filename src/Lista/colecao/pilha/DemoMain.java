package Lista.colecao.pilha;

import java.util.Stack;

public class DemoMain {

    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        
        String[] parentes = {
                "(()()()())",   
                "(((())))",    
                "(()((())()))", 
                "((((((())",    
                "()))",       
                "(()()(()"      
        };

       
        for (String expressao : parentes) {
            
            boolean resultadoDaVez = true; 

            for (char caractereAtual : expressao.toCharArray()) {
                if (caractereAtual == '(') {
                    pilha.push(caractereAtual);
                    resultadoDaVez = true;
                } else if (caractereAtual == ')') {
                    if (pilha.isEmpty()) {
                        resultadoDaVez = false; 
                        break; 
                    } else {
                        pilha.pop();
                    }
                }
            } 

           
            if (resultadoDaVez == true && !pilha.isEmpty()) {
                resultadoDaVez = false;
            }

            
            System.out.println("A expressão '" + expressao );
        } 
    }
}