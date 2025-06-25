package Lista.abastratoPolimorfismoInterface.figuraGeometrica;

public class Quadrado extends FiguraGeometrica{
    private int tamanhoLados;
    
    public Quadrado (int tamanhoLados){
        this.tamanhoLados = tamanhoLados;
    }

    public int area(){
        return tamanhoLados*tamanhoLados;
    }

    public String descricao(){
        return "Tamanho dos lados do quadrado: " + tamanhoLados + "\n" + "Area: " + area();
    }

    

}
