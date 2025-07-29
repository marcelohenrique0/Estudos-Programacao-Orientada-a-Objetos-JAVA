package Lista.colecao.Consultorio;

public class Paciente {

    private int rg;
    private int idade;

    Paciente(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "rg=" + rg + ", idade=" + idade;
    }

}
