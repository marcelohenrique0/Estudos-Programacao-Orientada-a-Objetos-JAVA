package Aulas.Abstrato.controle;

public class Carro extends Terrestre{

    private String placa;

    public Carro(int capacidade, int qtdRodas, String placa) {
      super(capacidade, qtdRodas);
      this.placa = placa;
    }
    

    public void moveFrente(){
         System.out.println("Carro está movimentando para frente...");
    }


    @Override
    public String toString() {
        return super.toString() + "placa=" + placa;
    }

    

    


}
