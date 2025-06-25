package Lista.abastratoPolimorfismoInterface.figuraGeometrica;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;
    private double hipotenusa;

    public Triangulo(double base, double altura, double hipotenusa){
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }

    public double area(){
        return (base * altura) / 2;
    }
    
    public String descricao(){
        return "Base: " + base + "\n" + "Altura: " + altura + "\n" + "Hipotenusa: " + hipotenusa + "\n" + "Area: " + area();
    }

}
