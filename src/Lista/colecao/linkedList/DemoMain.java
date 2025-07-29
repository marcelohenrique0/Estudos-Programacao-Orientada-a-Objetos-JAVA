package Lista.colecao.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class DemoMain {
    public static void main(String[] args) {
        LinkedList<Character> lista1 = new LinkedList<>(
                Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'U'));
        LinkedList<Character> lista2 = new LinkedList<>();

        for (int i = lista1.size() - 1; i >= 0; i--) {
            lista2.add(lista1.get(i));
        }

        System.out.println(lista1);
        System.out.println(lista2);

    }

}
