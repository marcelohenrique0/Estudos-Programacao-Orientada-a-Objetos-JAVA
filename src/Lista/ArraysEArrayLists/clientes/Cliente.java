package Lista.ArraysEArrayLists.clientes;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    Cliente(int id, String nome, int idade, String telefone ){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString(){
        return "ID: " + id + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade  + "\n" + "Telefone: " + telefone;
    }
    

}
