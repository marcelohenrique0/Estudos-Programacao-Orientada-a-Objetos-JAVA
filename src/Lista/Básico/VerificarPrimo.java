package Lista.Básico;

import java.util.Scanner;

public class VerificarPrimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o numero para verificar se é primo: ");
        int numero = leitor.nextInt();

        int divisores = 2;

        if (numero < 2) {
            System.out.println("O número deve ser maior ou igual a 2.");
        } else {
            if (verificaPrimo(numero, divisores)) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        leitor.close();

    }

    public static boolean verificaPrimo(int n, int divisores) {
        if (n == divisores) {
            return true;
        } else if (n % divisores == 0) {
            return false;
        } else {
            return verificaPrimo(n, divisores + 1);
        }
    }

}
