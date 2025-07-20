package Lista.colecao.mapa;

import java.util.TreeMap;

public class DemoMain {

    public static void main(String[] args) {
        String texto = "HELLO THERE";
        TreeMap<Character, Integer> contagemDeLetras = new TreeMap<>();

        for (char letraAtual : texto.toCharArray()) {  
            if (Character.isLetter(letraAtual)){ //aqui só entra se for letra
                if (contagemDeLetras.containsKey(letraAtual)) {
                    int qtd = contagemDeLetras.get(letraAtual);
                    contagemDeLetras.put(letraAtual, qtd + 1);
                } else {
                    contagemDeLetras.put(letraAtual, 1);
                }
                
            }
        }

        System.out.println("CONTAGEM DE LETRAS ATUAIS: ");

        for (Character letra : contagemDeLetras.keySet()) {
            System.out.println(letra + " " + contagemDeLetras.get(letra));

        }

    }
}
