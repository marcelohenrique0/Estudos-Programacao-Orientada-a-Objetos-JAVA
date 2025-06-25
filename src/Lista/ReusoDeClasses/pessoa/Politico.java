package Lista.ReusoDeClasses.pessoa;

public class Politico extends Pessoa {

    private String partidoPolitico;

    Politico(String nome, String cpf, String partidoPolitico){
        super(nome, cpf);
        this.partidoPolitico = partidoPolitico;
    }

    public String toString(){
        return super.toString() + "\n" + "Partido Político: " + partidoPolitico;
    }

}
