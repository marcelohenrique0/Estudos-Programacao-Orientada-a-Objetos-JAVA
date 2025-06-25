package Lista.ReusoDeClasses.livro;

public class LivroLivraria extends Livro {
    private double preco;
    private int estoque;

    LivroLivraria(String nome, String autor, int anoDePublicao, double preco, int estoque ){

        super(nome, autor, anoDePublicao);
        this.preco = preco;
        this.estoque = estoque;
    }


    public String toString(){
        
        return super.toString() + "\n" + "Preço: " + preco + "\n" + "Estoque disponivel: " + estoque;

    }

    
}
