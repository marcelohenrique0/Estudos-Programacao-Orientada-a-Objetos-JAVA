package Lista.ReusoDeClasses.pessoa;

public class Prefeito extends Politico {

    private String cidade;

    Prefeito(String nome, String cpf, String partidoPolitico, String cidade) {
        super(nome, cpf, partidoPolitico);
        this.cidade = cidade;
    }

    public String toString() {
        return super.toString() + "\n" + "Cidade: " + cidade;
    }
}
