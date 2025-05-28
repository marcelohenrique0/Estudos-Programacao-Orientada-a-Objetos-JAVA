package Lista.Básico;

import java.util.Scanner;



public class NumeroPerfeito {
    public static void main(String[] ags){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero de três algarismo: ");
        int numero = leitor.nextInt();

        int soma = 0;

        for(int i = 1; numero > i; i++){
            if(numero % i == 0){
                System.out.print(i + " + ");
                soma = soma + i;
            }
        }

        System.out.println();

        if (soma == numero && numero > 1) { 
            System.out.println(numero + " É um número perfeito! (Soma = " + soma + ")");
        } else {
            System.out.println(numero + " NÃO é um número perfeito. (Soma = " + soma + ")");
        }

        leitor.close();
    }

}
