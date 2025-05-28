package Aulas.CriacaoClass.Circulo;

public class DemoCirculo {

    public static void main(String[] args) {
        System.out.println(Circulo.pi);

        Circulo c1 = new Circulo(1);
        System.out.println(c1.perimetro());
        Circulo c2 = new Circulo(2);
        System.out.println(c2.perimetro());

    }

}
