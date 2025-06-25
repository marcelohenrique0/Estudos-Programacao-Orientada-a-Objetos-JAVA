package Aulas.universidade;

public class RegistroAcademicoPosGraducao {

    private RegistroAcademico registro;
    private String tituloTeste;
    private String orientador;

    
    // aqui melhor usar quando um objeto já existe e só passo objeto já construido
    public RegistroAcademicoPosGraducao(RegistroAcademico registro, String tituloTeste, String orientador) {
        this.registro = registro;
        this.tituloTeste = tituloTeste;
        this.orientador = orientador;
    }


    

    public RegistroAcademicoPosGraducao(String nome, String matricula, String curso, String tituloTeste, String orientador) {
        this.registro = new RegistroAcademico(nome, matricula, curso);
        this.tituloTeste = tituloTeste;
        this.orientador = orientador;
    }



    public String toString() {
        return  registro + ", tituloTeste=" + tituloTeste + ", orientador=" + orientador ;
    }

    
    



}
