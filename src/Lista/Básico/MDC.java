package Lista.Básico;

import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero 1 para descobri o MDC: ");
        int n = leitor.nextInt();
        System.out.print("Digite o numero 2 para descobri o MDC: ");
        int m = leitor.nextInt();

        int resultado = calculoDoMdc(m, n);

        System.out.println("O divisor comum de " + n + " e " + m + " é " + resultado);






        leitor.close();
    }

    // só trocar as ordem aqui para não ocorrer recursão infinita   
    public static int calculoDoMdc(int m, int n){
        if(n > m){
            return calculoDoMdc(n,m);
        }else if (n == 0){
            return m;
        }else{
            return calculoDoMdc(n,m % n);
        }
    }

}
