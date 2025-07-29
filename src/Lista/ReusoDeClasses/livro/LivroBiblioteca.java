package Lista.ReusoDeClasses.livro;

public class LivroBiblioteca extends Livro {

    private int id;
    private int quantidadeLivroDisponivel;

    LivroBiblioteca(String nome, String autor, int anoDePublicao, int id, int quantidadeLivroDisponivel) {
        super(nome, autor, anoDePublicao);

        this.id = id;
        this.quantidadeLivroDisponivel = quantidadeLivroDisponivel;
    }

    public String toString() {
        return super.toString() + "\n" + "ID: " + id + "\n" + "Quantidade de livro disponivel: "
                + quantidadeLivroDisponivel;
    }

}
