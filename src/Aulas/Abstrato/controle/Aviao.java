package Aulas.Abstrato.controle;

public class Aviao extends Aereo{

    private String cadAviao;
    
    
    public Aviao(int capacidade, String cadANAC, String cadAviao) {
        super(capacidade, cadANAC);
        this.cadAviao = cadAviao;
    }
    
    public void moveFrente(){
        System.out.println("Aviao está movimentando para frente...");
    }

    @Override
    public String toString() {
        return super.toString() + "cadAviao=" + cadAviao;
    }


    
    

}
