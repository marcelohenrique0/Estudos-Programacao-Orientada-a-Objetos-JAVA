package Lista.Básico;

import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero 1 : ");
        int numero = leitor.nextInt();

        int menorNumero = numero;
        for(int i = 1; i < 3; i++){
            System.out.print("Digite o numero: " + (i +1));
            numero = leitor.nextInt();
            if( numero < menorNumero){
                menorNumero = numero;
            }
        }

        System.out.println("O menor numero é " + menorNumero);

        leitor.close();
        
    }

}
