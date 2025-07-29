package Lista.ArraysEArrayLists.Dados;

import java.util.Random;

// refazer
public class Dados {

    public static void main(String[] args) {
        Random gerarNumeros = new Random();

        int frequencia[] = new int[13];

        for (int i = 0; i < 36000000; i++) {
            int valorDoDado1 = gerarNumeros.nextInt(6) + 1;
            int valorDoDado2 = gerarNumeros.nextInt(6) + 1;
            int soma = valorDoDado1 + valorDoDado2;

            frequencia[soma]++;

        }

        System.out.println("O resultado da simulação: ");

        for (int i = 2; i <= 12; i++) {
            System.out.println(i + " A FREQUENCIA: " + frequencia[i]);
        }

    }

}
