package Aulas.universidade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private String curso;
    public RegistroAcademico(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    

    public String toString() {
        return "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso;
    }

    

}
