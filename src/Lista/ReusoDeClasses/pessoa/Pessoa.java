package Lista.ReusoDeClasses.pessoa;

public class Pessoa {
    private String nome;
    private String cpf;

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + nome + "\n" + "CPF: " + cpf;
    }

}
