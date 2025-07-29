package Lista.abastratoPolimorfismoInterface.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    public String toString() {
        return "Titulo do Livro: " + titulo + "\n" + "Autor do livro: " + autor + "\n" +
                "Numero de pagina: " + numeroDePaginas + "\n" + "Ano de edicação: " + anoDaEdicao;
    }

}
