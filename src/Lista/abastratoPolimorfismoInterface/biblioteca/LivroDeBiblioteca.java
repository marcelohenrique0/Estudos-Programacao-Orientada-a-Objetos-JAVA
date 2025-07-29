package Lista.abastratoPolimorfismoInterface.biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean situacaoLivro;
    private String localizacaoDoLivro;
    private String descricaoDoLivro;

    LivroDeBiblioteca(String titulo, String autor, int anoDaEdicao, int numeroDePaginas,
            boolean situcaoLivro, String localizacaoDoLivro, String descricaoDoLivro) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.situacaoLivro = situcaoLivro;
        this.localizacaoDoLivro = localizacaoDoLivro;
        this.descricaoDoLivro = descricaoDoLivro;

    }

    public boolean estaEmprestado() {
        return situacaoLivro;
    }

    public void empresta() {
        situacaoLivro = true;
    }

    public void devolve() {
        situacaoLivro = false;
    }

    public String localizacao() {
        return localizacaoDoLivro;
    }

    public String descricao() {
        return descricaoDoLivro;

    }

    public String toString() {
        return super.toString() + "\n" + "Situação do livro: " + (estaEmprestado() ? "Sim" : "Não") + "\n"
                + "Descrição do livro: " + descricaoDoLivro + "\n" + "Localização do livro: " + localizacaoDoLivro;
    }

}
