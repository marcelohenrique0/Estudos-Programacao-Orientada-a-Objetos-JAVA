package Lista.abastratoPolimorfismoInterface.figuraGeometrica;

public class DemoFiguraGeometrica {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(3.99);

        Quadrado q1 = new Quadrado(12);

        Triangulo t1 = new Triangulo(20, 10, 22);

        System.out.println("Ciruclo: ");
        System.out.println(c1.descricao());

        System.out.println("Quadrado: ");
        System.out.println(q1.descricao());

        System.out.println("Triangulo: ");
        System.out.println(t1.descricao());
    }

}
