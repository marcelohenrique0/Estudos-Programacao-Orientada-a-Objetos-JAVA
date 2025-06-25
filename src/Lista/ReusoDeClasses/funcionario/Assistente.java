package Lista.ReusoDeClasses.funcionario;

public class Assistente extends Funcionario{

    private int matricula;

    Assistente(String nome, float salario, int matricula ){
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString(){

        return super.toString() + "\n" + "Matricula do Assistente: " + matricula;
    }
    

}
