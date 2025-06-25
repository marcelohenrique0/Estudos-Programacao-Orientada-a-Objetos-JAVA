package Lista.abastratoPolimorfismoInterface.biblioteca;

public class DemoLivroBiblioteca {
    
    public static void main(String[] args) {
        LivroDeBiblioteca livro1 = new LivroDeBiblioteca("Banco de dados1", "Bruno gomes", 2000, 330, false, "Corredor 2, Prateleiro D", "Livro teorico sobre banco de dados e seus fundamentos");

        
        livro1.empresta();
        
        System.out.println(livro1.estaEmprestado());
        
        System.out.println(livro1.descricao());
        System.out.println(livro1.localizacao());
        
        livro1.devolve();
        
        
        
        System.out.println(livro1);


    }

}
