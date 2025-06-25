package Aulas.Genericas.remocaoCores;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveCores {

    public static void main(String[] args) {

        LinkedList <String> listaCores = new LinkedList<>(Arrays.asList("azul", "amarelo", "cinza", "rosa", "verde","vermelho","preto"));

        LinkedList <String> remover = new LinkedList<>(Arrays.asList("amarelo", "verde"));

        System.out.println(listaCores);

        remove(listaCores, remover);

        System.out.println(listaCores);

        
    }

    public static void remove(LinkedList<String> listaCompleta, LinkedList<String> listaDeRemocao){
        Iterator<String> itera = listaCompleta.iterator(); // é um objeto que vai permitir percorrer lista completa

        while (itera.hasNext()) { // diz se já chegeui no final da lista 
            if (listaDeRemocao.contains(itera.next())) { // verifico que item de itera está na lista de remoção.
                itera.remove();
            }
            
        }


    }

}
