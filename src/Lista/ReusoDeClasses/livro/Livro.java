package Lista.ReusoDeClasses.livro;

public class Livro {
    private String nomeDoLivro;
    private String autor;
    private int anoDePublicao;

    Livro(String nomeDoLivro, String autor, int anoDePublicao) {
        this.nomeDoLivro = nomeDoLivro;
        this.autor = autor;
        this.anoDePublicao = anoDePublicao;
    }

    public String toString() {
        return "Nome do Livro: " + nomeDoLivro + "\n" + "Autor: " + autor + "\n" + "Ano de publicação: "
                + anoDePublicao;
    }

}
