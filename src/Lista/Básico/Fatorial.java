package Lista.Básico;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o fatorial: ");
        int numero = leitor.nextInt();

        int fatorial = calculoDeFatoria(numero);

        System.out.println("O fatorial do numero " + numero + " é de " + fatorial);

        leitor.close();
    }


    public static int calculoDeFatoria(int n){
        if(n == 0){
            return 1;
        }else{

            return n * calculoDeFatoria(n - 1);
        }
    }

}
