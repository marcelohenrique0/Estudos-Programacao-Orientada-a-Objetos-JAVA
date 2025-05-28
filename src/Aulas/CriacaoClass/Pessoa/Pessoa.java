package Aulas.CriacaoClass.Pessoa;

public class Pessoa {
    private String nome;
    private double altura;

    Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }
    

    public String getNome(){
        return "Nome é " + this.nome.toUpperCase();
    }

    public void setNome(String nome){
        
        if(!nome.isEmpty()) this.nome = nome;
    }


    public String toString(){
        String res = "";
        res += "Nome: " + nome;
        res += "\n Altura: " + altura;
        return res;
    }
}
