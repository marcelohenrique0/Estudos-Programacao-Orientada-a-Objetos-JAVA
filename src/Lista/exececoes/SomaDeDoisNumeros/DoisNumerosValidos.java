package Lista.exececoes.SomaDeDoisNumeros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoisNumerosValidos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero1 = obterIntValido(leitor);
        int numero2 = obterIntValido(leitor);
        System.out.println("Logo, A soma do Numero: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        leitor.close();

    }

    public static int obterIntValido(Scanner leitor) {
        boolean validar = false;
        int numero = 0;

        do {

            System.out.print("Digite um numero inteiro: ");
            try {
                numero = leitor.nextInt();
                validar = true;
                leitor.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                leitor.nextLine();

            }
        } while (!validar);

        return numero;
    }

}
