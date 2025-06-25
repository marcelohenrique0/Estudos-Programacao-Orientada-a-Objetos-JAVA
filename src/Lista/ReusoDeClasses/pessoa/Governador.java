package Lista.ReusoDeClasses.pessoa;

public class Governador extends Politico{
    private String estado;

    Governador(String nome, String cpf, String partidoPolitico, String estado){
        super(nome, cpf, partidoPolitico);
        this.estado = estado;

    }

    public String toString(){
        return super.toString() + "\n" + "Estado: " + estado;
    }
}
