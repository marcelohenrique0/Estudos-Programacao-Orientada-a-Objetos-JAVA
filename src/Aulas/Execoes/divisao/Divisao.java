package Aulas.Execoes.divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, den = 0;
        boolean numeradorCorreto = false;
        boolean denominadorCorreto = false;
        System.out.println("Numerador: ");
        do{
            try{
                num = sc.nextInt();

                numeradorCorreto = true;
                
            }catch(InputMismatchException e){
                System.out.println("o numerador deveria ser inteiro");
                sc.nextLine();
            }
            
        }while(!numeradorCorreto);

        System.out.println("Denominador: ");
        do{
            try{
                den = sc.nextInt();

                denominadorCorreto = true;
                
            }catch(InputMismatchException e){
                System.out.println("o denominador deveria ser inteiro");
                sc.nextLine();
            }
            
        }while(!denominadorCorreto);



        try{
            System.out.println(num + " / " + den + " = " + divisaoInteiro2(num, den));
            
        }catch(ArithmeticException e){
            System.out.println("Calculo não foi realizado, pois denominador é zero");
        }



        System.out.println(num + " / " + den + " = " + divisaoInteiro(num, den));
        
        sc.close();
        
    }


    public static int divisaoInteiro2(int numerador, int denominador) throws ArithmeticException{
            return numerador/denominador;
    }

    public static int divisaoInteiro(int numerador, int denominador){
        int resultado = 0;
        try{
            resultado = numerador/denominador;

        }catch(ArithmeticException e){
            System.out.println("Divisao por zero nao");

        }
        return resultado;
    }

}
