package Lista.ReusoDeClasses.livro;

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
