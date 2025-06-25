package Lista.ReusoDeClasses.livro;



//Campos em Comum (herdados de Livro): nomeDoLivro, autor, anoDePublicao.
//Diferenças
//LivroLivraria tem os campos específicos: preco e estoque.
//LivroBiblioteca tem os campos específicos: id e quantidadeLivroDisponivel


public class DemoLivro {
    public static void main(String[] args) {
        LivroLivraria livro1 = new LivroLivraria("BANCO DE DADOS1", "Bruno silva", 2024, 40, 30);
        LivroBiblioteca livro2 = new LivroBiblioteca("POO1", "Italo", 2025, 12, 5);

        System.out.println("Livraria");
        System.out.println(livro1);

        System.out.println("Biblioteca: ");
        System.out.println(livro2);
    }

}
