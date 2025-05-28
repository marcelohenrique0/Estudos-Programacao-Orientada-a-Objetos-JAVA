package Lista.CriacaoClass.RegistroAcademico;

public class RegistroAcademico {

    private String nomeDoAluno;
    public static int numeroDematricula = 0;
    private int codigoDoCurso;
    private int percentualDeCobraca;
    private int matricula;

    RegistroAcademico(String nomeDoAluno, int codigoCurso, int percentualDeCobraca,int matricula){
        this.nomeDoAluno = nomeDoAluno;
        this.codigoDoCurso = codigoCurso;
        this.percentualDeCobraca = percentualDeCobraca;
        this.matricula = matricula;

        numeroDematricula++;

        System.out.println("Aluno Matriculado com Sucesso.");

    }


    
    public double calulaMensalidade(){
        return 100.0 *codigoDoCurso*(percentualDeCobraca/100.0);
        
    }
    
    public String toString(){
    
        return "Nome do Aluno " + nomeDoAluno + " Matricula do Aluno: " + matricula + " Percentual de Cobrança: " + calulaMensalidade();
    }

    public static int getTotalDeMatriculas(){
        return numeroDematricula;
    }
}
