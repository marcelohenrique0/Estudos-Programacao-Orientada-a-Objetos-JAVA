package Aulas.Abstrato.controle;

public class DemoControle {
    public static void main(String[] args) {
        Carro a = new Carro(5, 4, "asf1223");
        Barco b = new Barco(10, 2.5f, 22334);
        Aviao c = new Aviao(22, "33455asf", "1215ffff");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        Controle controle = new Controle();

        controle.controlar(a);
        controle.controlar(b);
        controle.controlar(c);

    }

}
