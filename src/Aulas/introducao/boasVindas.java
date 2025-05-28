package Aulas.introducao;


import java.util.Scanner;
public class boasVindas {
    public static void main(String[] args) {
        System.out.println("Boas vindas");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.next();

        System.out.printf("Boas vindas, %s", nome);


        entrada.close();
    }

}
