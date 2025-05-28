package Aulas.CriacaoClass.tupla;

public class DemoTupla {
    public static void main(String[] args) {
        Tupla <String, Double> t1 = new Tupla<>("Ufersa", 1.2353);

        System.out.println(t1);

        Tupla<Character, Integer> t2 = new Tupla<>('F', 2);

        System.out.println(t2);


    }

}
