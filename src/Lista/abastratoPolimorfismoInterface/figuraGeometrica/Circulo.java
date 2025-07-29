package Lista.abastratoPolimorfismoInterface.figuraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return 3.14 * (raio * raio);
    }

    public String descricao() {
        return "Raio do Circulo: " + raio + "\n" + "Area: " + area();
    }

}
