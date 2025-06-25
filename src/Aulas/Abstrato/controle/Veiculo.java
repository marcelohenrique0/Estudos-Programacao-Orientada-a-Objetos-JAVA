package Aulas.Abstrato.controle;

public abstract class Veiculo {

    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moveFrente(); // estou dizendo que esse metódo é abastract, seja não tem implementação, serve a pena como um regra
    // assim obriga os outras classes ter a implementação desse metodo lá. 
    

    @Override
    public String toString() {
        return "capacidade=" + capacidade;
    }

    

}
