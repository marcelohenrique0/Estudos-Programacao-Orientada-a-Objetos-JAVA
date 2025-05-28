package Aulas.CriacaoClass.faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private int percentualDeCobraca;


    public void inicializaRegistroAcademico(String n, String m, int c, int p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobraca = p;

    }

    public double calulaMensalidade(){
        return 100.0 *codigoCurso*(percentualDeCobraca/100.0);

    }

}
