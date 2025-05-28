package Lista.Básico;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println(nome + " Seus números da Mega-Sena: ");
        DecimalFormat formato = new DecimalFormat("00"); 


        for(int i = 0 ; i  <  10; i++){
            for(int j = 0; j < 6; j++){
                System.out.printf("  %s", formato.format(rand.nextInt(60) + 1));
            }
            System.out.println();
        }

        leitor.close();

    }

}
