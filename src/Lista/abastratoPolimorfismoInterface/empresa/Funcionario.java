package Lista.abastratoPolimorfismoInterface.empresa;


public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int id;

    Funcionario (String nome, double salarioPorHora, int id){
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.id = id;
    }

    Funcionario(String nome){
        this.nome = nome;
        this.salarioPorHora = 2.0;
        this.id = 0;
    }

    Funcionario(String nome, double salarioPorHora){
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.id = 0;
    }

    public String getNome(){
        return this.nome;
    }
    public double getSalarioPorHora(){
        return this.salarioPorHora;
    }

    public int getId(){
        return this.id;
    }

    public void setNome(String nome){
        this.nome = nome;
        
    }

    public void setSalarioPorHora(double salarioPorHora){
        this.salarioPorHora = salarioPorHora;
    }

    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return "Nome do Funcionario: " + nome + "\n" + "Salario por Hora: " + salarioPorHora + "\n" + "ID: " + id;
    }

}
