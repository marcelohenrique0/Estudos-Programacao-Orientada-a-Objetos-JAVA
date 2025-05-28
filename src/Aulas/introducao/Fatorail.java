package Aulas.introducao;

import java.util.Scanner;

public class Fatorail {

    public static void main(String[] args) {
        
        Scanner  leitor = new Scanner(System.in);
        int num,fat;

        System.out.print("valor: ");
        num = leitor.nextInt();

        fat = fatorial(num);

        System.out.println("Fatorial é " + num +" é igual: " +fat);


        leitor.close();
        
    }

    public static int fatorial (int n ){
        if(n == 0){
            return 1;
        }else{
            return n*fatorial(n-1);
        }
    }
}
