package Lista.Básico;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int expoente, base, resultado;

        System.out.print("Digite a base da potencia: ");
        base = leitor.nextInt();
        
        do{
        System.out.print("Digite o expoente da potencia: ");
        expoente = leitor.nextInt();
        }while(expoente < 1);


        resultado = calculoDaPotencia(base,expoente);

        System.out.printf("O resultado da potencia é %d%n", resultado);

        leitor.close();
        
    }


    public static int calculoDaPotencia(int base, int expoente){
        if(expoente == 1){
            return base;
        }else{
            return base * calculoDaPotencia(base, expoente - 1);
        }
    }

}


