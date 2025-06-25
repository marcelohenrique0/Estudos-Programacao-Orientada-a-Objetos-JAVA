package Aulas.Abstrato.Empresa;

public abstract class Empregado implements Pagavel { // quem herdar de Empregado é transferido obrigação do metodo pagavel, caso não coloque abstract e metodo aqui as classes filhos é herado o metodo

    private String nome;
    private String ctps;
    public Empregado(String nome, String ctps) {
        this.nome = nome;
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", ctps=" + ctps + "]";
    }

    


}
