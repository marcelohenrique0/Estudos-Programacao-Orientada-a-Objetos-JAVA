package Lista.Básico;

import java.util.Scanner;

public class CDU {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero: ");

        int number = leitor.nextInt();

        int centena = number /100;
        int dezena = (number % 100) / 10;
        int unidade = (number % 100) % 10;

        System.out.printf("Número informado no formado UCD: %d%d%d\n", unidade, centena, dezena);


        leitor.close();
        

        
    }

}
