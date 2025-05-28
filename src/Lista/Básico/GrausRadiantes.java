package Lista.Básico;

import java.util.Scanner;

public class GrausRadiantes {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o angulo em grau: ");
        float angulo = leitor.nextFloat();

        double raddiano = Math.toRadians(angulo);

        System.out.println("Seno: " + Math.sin(raddiano));
        System.out.println("Cosseno: " + Math.cos(raddiano));
        System.out.println("Tan: " + Math.tan(raddiano));
        System.out.println("cossecante : " + (1/Math.sin(raddiano)));
        System.out.println("secante: " + (1/Math.cos(raddiano)));
        System.out.println("Contg " + (Math.cos(raddiano)/Math.sin(raddiano)));

        leitor.close();

    }
}
