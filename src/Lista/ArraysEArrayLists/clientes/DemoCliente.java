package Lista.ArraysEArrayLists.clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] ags) {
        ArrayList<Cliente> clientes = new ArrayList<>(); // inicializar o arrayList

        Scanner leitor = new Scanner(System.in);

        int id;
        String nome;
        int idade;
        String telefone;

        do {

            System.out.print("Digite o ID: ");
            id = leitor.nextInt();
            leitor.nextLine();
            if (id > 0) {
                System.out.print("Digite o nome: ");
                nome = leitor.nextLine();
                System.out.print("Digite a idade: ");
                idade = leitor.nextInt();
                System.out.print("Digite o telefone: ");
                telefone = leitor.next();

                Cliente c1 = new Cliente(id, nome, idade, telefone);
                clientes.add(c1);
                System.out.println("Cadastrado com sucesso ");
            } else {
                System.out.println("Digitou um id negativo e não foi cadastrado com sucesso! ");
            }

        } while (id > 0);

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente foi cadastrado");
        } else {
            for (Cliente todosClientes : clientes) {
                System.out.println(todosClientes);
            }

        }

        leitor.close();
    }

}
