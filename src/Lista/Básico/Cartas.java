package Lista.Básico;

import java.util.Scanner;

public class Cartas {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número da Carta (1 a 13): ");
        int numeroCarta = leitor.nextInt();

        System.out.print("Digite o numero de Naipe (1 = Ouros, 2 = Paus, 3 = Copas, 4 = Espadas): ");
        int numeroNaipe = leitor.nextInt();

        switch (numeroCarta) {
            case 1:

                System.out.println("ÁS de " + Naipe(numeroNaipe));

                break;
            case 2:

                System.out.println("Dois de " + Naipe(numeroNaipe));

                break;

            case 3:
                System.out.println("Três de " + Naipe(numeroNaipe));

                break;

            case 4:
                System.out.println("Quatro de " + Naipe(numeroNaipe));

                break;

            case 5:
                System.out.println("Cicno de " + Naipe(numeroNaipe));

                break;

            case 6:
                System.out.println("Seis de " + Naipe(numeroNaipe));

                break;

            case 7:
                System.out.println("Sete de " + Naipe(numeroNaipe));

                break;
            case 8:
                System.out.println("Oito de " + Naipe(numeroNaipe));

                break;

            case 9:
                System.out.println("Nove de " + Naipe(numeroNaipe));

                break;
            case 10:
                System.out.println("Dez de " + Naipe(numeroNaipe));

                break;

            case 11:
                System.out.println("Valete de " + Naipe(numeroNaipe));

                break;
            case 12:
                System.out.println("Dama de " + Naipe(numeroNaipe));

                break;

            case 13:
                System.out.println("Rei de " + Naipe(numeroNaipe));

                break;

            default:
                System.out.println("Nãos existe esse número de carta");
                break;
        }

        leitor.close();
    }

    public static String Naipe(int numeroNaipe) {
        if (numeroNaipe == 1) {
            return "Ouro";
        } else if (numeroNaipe == 2) {
            return "Paus";
        } else if (numeroNaipe == 3) {
            return "Copas";
        } else if (numeroNaipe == 4) {
            return "Espada";
        } else {
            return "Não existe esse Naipe";
        }

    }

}
