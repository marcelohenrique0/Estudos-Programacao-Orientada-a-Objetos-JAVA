package Aulas.introducao;

import java.util.Scanner;
public class distanciaDeDoisPontos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite x1: ");
        double x1 = input.nextDouble();
        System.out.print("Digite y1: ");
        double y1 = input.nextDouble();

        System.out.print("Digite x2: ");
        double x2= input.nextDouble();
        System.out.print("Digite Y2: ");
        double y2 = input.nextDouble();

        double distanciaDeDoisPontos = Math.sqrt(Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0));

        System.out.printf("Distancia entre %s,%s  e %s,%s: %s",x1,y1,x2,y2,distanciaDeDoisPontos);


        input.close();

        
    }

}
