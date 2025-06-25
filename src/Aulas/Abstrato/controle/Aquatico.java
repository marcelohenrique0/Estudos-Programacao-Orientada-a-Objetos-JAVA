package Aulas.Abstrato.controle;

public abstract class Aquatico extends Veiculo{

    private float pronfundidade;

    public Aquatico(int capacidade, float pronfundidade) {
        super(capacidade);
        this.pronfundidade = pronfundidade;
    }

    @Override
    public String toString() {
        return super.toString()  + "pronfundidade=" + pronfundidade + "]";
    }

    
    

}
