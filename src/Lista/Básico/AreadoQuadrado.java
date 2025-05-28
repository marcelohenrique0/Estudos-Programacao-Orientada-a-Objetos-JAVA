package Lista.Básico;

import java.util.Scanner;

public class AreadoQuadrado {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        int lado = leitor.nextInt();

        double area = Math.pow(lado, 2);

        System.out.println("SUA ÁREA É DE: " + area);


        leitor.close();


    }

}
