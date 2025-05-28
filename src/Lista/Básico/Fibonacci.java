package Lista.Básico;

import java.util.Scanner;



public class Fibonacci {

    public static void main(String[] args) {
        Scanner leior = new Scanner(System.in);

        int numeroFib;
        do{
            System.out.print("Digite o numero da fibonacci: ");
            numeroFib = leior.nextInt();    

        }while(numeroFib <= 0);

        int a = 0;
        int b = 1;

        System.out.printf("0 1");

        for(int i = 0; i < numeroFib; i++){
            int fib = a + b;
            System.out.printf(" %s", fib);
            a = b;
            b = fib;
        }
        leior.close();
    }

}
