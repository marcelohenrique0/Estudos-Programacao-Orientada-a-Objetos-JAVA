package Lista.exececoes.meses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoMeses {
    public static void main(String[] args) {

        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite o numero do Mes (1 a 12): ");
        try {
            int numero = leitor.nextInt();

            System.out.println("Mês correspondente: " + meses[numero - 1]);

        } catch (InputMismatchException e) {
            System.out.println("Entrada Invalida!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Número de mês inválido!");
        } finally {
            leitor.close();
        }
    }
}
