package Aulas.introducao;

import java.util.Scanner;


public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digiteo  numero inteiro para descobri o perfeito: ");

        int numero = leitor.nextInt();

        int totalNumero = 0;
        int soma = 0;

        for(int i = 1; i <+ numero; i++){
            if(numero % i == 0 && totalNumero <= 4 ){
                soma += i;
                totalNumero++;

                System.out.printf("%s + ",i);

            }

        }

        System.out.printf("= %s", soma);

        leitor.close();
    }

}
