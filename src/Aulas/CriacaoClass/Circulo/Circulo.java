package Aulas.CriacaoClass.Circulo;

public class Circulo {
    private double raio;
    public static final double pi = 3.1415; // quero só um pi para todos
    
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double perimetro(){
        return 2 * pi * raio;
    }
    @Override
    public String toString() {
        return " raio=" + raio;
    }

    





}
