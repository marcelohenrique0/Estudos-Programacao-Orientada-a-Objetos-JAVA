package Aulas.Abstrato.controle;

public class Barco extends Aquatico{

    private int cadBarco;
    
    public Barco(int capacidade, float pronfundidade, int cadBarco) {
        super(capacidade, pronfundidade);
        this.cadBarco = cadBarco;
    }
    public void moveFrente(){
        System.out.println("Barco está movimentando para frente...");
    }
    @Override
    public String toString() {
        return  super.toString() + "cadBarco=" + cadBarco;
    }


    
    

}
