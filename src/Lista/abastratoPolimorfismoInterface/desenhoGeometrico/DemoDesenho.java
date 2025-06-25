package Lista.abastratoPolimorfismoInterface.desenhoGeometrico;

import Lista.abastratoPolimorfismoInterface.figuraGeometrica.Circulo;
import Lista.abastratoPolimorfismoInterface.figuraGeometrica.FiguraGeometrica;
import Lista.abastratoPolimorfismoInterface.figuraGeometrica.Quadrado;

public class DemoDesenho {
    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Quadrado(2);
        FiguraGeometrica figura2 = new Circulo(22);

        Desenho desenho1 = new Desenho(figura1, figura2, 22, 11, 13, 10);

        System.out.println(desenho1.apresenta());

    }

}
