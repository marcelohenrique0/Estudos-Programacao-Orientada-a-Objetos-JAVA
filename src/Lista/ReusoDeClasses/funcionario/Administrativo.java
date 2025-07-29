package Lista.ReusoDeClasses.funcionario;

public class Administrativo extends Assistente {
    private String turno;
    private float adicionalNoturno;

    Administrativo(String nome, float salario, int matricula, String turno, float adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;

        if (turno.equals("noite")) {
            this.adicionalNoturno = adicionalNoturno;
        } else {
            this.adicionalNoturno = 0;
        }
    }

    public float ganhoAnual() {
        float ganhoDos12Meses = (getSalario() + adicionalNoturno) * 12 + getSalario();

        return ganhoDos12Meses;
    }

    public String toString() {

        return super.toString() + "\n" + "Turno: " + turno + "\n" + "Adicional noturno " + adicionalNoturno;
    }

}
