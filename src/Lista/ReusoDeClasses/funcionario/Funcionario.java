package Lista.ReusoDeClasses.funcionario;


public class Funcionario {

    private String nome;
    private float salario;

    Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;

    }


    public void aumentoSalario(float aumento){
        salario += aumento;
    }

    public float ganhoAnual(){

        return (salario * 12) + salario;
        
    }

    public String getNome(){
        return nome;
    }

    public float getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }


    public String toString(){
        return "Nome: " + nome + "\n" + "Salario: " + salario + "\n" + "Ganho Anual: " + ganhoAnual();
    }



}
