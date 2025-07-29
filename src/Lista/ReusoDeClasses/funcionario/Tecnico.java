package Lista.ReusoDeClasses.funcionario;

public class Tecnico extends Assistente {
    private float bonusSalarial;

    Tecnico(String nome, float salario, int matricula, float bonuSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonuSalarial;
    }

    public float ganhoAnual() {
        return (getSalario() + bonusSalarial) * 13;
    }

    public String toString() {
        return super.toString() + "\nBônus Salarial: " + bonusSalarial;

    }

}
