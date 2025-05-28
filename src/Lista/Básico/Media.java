package Lista.Básico;

import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        
        Scanner leito = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = leito.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = leito.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = leito.nextFloat();

        float media = (nota1 + nota2 + nota3)/3;

        System.out.println("Sua media é " + media);

        leito.close();
    }

}
