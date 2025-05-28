package Aulas.CriacaoClass.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("LUCAS", 1.78);

        System.out.println(pessoa.getNome());

        pessoa.setNome("Carla");

        System.out.println(pessoa.getNome());

        

    }

}
