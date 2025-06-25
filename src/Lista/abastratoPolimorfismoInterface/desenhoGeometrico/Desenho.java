package Lista.abastratoPolimorfismoInterface.desenhoGeometrico;

import Lista.abastratoPolimorfismoInterface.figuraGeometrica.FiguraGeometrica;

public class Desenho {

    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private double x1,x2;
    private double y1,y2;
    
    Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, double x1, double y1, double x2, double y2){
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y1 = y2;

    }


    public String apresenta(){
        return "Coordenadas: ( " + x1 + "," + y1 + ")" + "\n" + figura1.descricao() + "\n"
        +  "Coordenadas: ( " + x1 + "," + y1 + ")" + "\n" +figura2.descricao();
    }

}
