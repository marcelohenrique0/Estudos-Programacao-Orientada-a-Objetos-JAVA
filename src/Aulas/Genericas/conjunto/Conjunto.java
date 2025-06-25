package Aulas.Genericas.conjunto;

import java.util.TreeSet;

public class Conjunto {

    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("preto");
        System.out.println(conjunto);
        conjunto.add("azul");
        System.out.println(conjunto);
        conjunto.add("laranja");
        System.out.println(conjunto);
        conjunto.add("cinza");
        System.out.println(conjunto);
        conjunto.add("rosa");
        System.out.println(conjunto);
        conjunto.add("verde");
        System.out.println(conjunto);
        conjunto.add("vermelho");
        System.out.println(conjunto);
        conjunto.add("preto");
        System.out.println(conjunto);
        conjunto.add("laranja");
        System.out.println(conjunto);
        conjunto.add("preto");
        System.out.println(conjunto);

        System.out.println("Antes: " + conjunto.headSet("preto"));
        System.out.println("Antes: " + conjunto.tailSet("preto"));

        System.out.println("Primeiro: " + conjunto.first());
        System.out.println("Primeiro: " + conjunto.last());

    }
}
