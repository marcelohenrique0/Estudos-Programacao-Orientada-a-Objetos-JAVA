package Aulas.empresa;

public class Pessoa {

    private String nome;
    private String identidade;


    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }


    public String getNome() {
        return nome;
    }


    public String getIdentidade() {
        return identidade;
    }

    public String toString() {
        return "nome=" + nome + ", identidade=" + identidade;
    }



    


    

    

}
