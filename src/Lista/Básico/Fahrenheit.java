package Lista.Básico;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o graus: ");

        float graus = leitor.nextFloat();

        float Fahr = (((graus  * 9 ) /5) + 32);
        
        System.out.println("Sua temperatura em fahrenheit é de " + Fahr);

        leitor.close();;

    }

}
