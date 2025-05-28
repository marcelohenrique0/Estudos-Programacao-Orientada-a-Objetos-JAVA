package Aulas.introducao;

import java.util.Scanner;

public class SomadosCubos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero para fazer verificação: ");
        int numero = leitor.nextInt();

        int cetena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int soma = (int)(Math.pow(cetena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3));

        if(soma == numero){
            System.out.printf("o cubos dos algarismo são igual %s = %s", numero, soma );
        }else{
            System.out.printf("Os cubos dos algarismos não são iguais ao número: %s != %s%n", soma, numero);
        }


        leitor.close();
    }

}
