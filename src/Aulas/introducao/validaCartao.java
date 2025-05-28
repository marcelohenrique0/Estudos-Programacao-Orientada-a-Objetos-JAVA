package Aulas.introducao;

import java.util.Calendar;
import java.util.Scanner;

public class validaCartao {

    public static void main(String[] args) {
        String nome, numero, codigo;
        boolean invalido;
        int mes, ano;
        Scanner leitor = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();
        int mesatual; 
        int anoatual;

        mesatual = calendario.get(Calendar.MONTH) + 1;
        anoatual = calendario.get(Calendar.YEAR);

        System.out.print("nome: ");
        nome = leitor.nextLine();
        System.out.print("numero: ");
        numero = leitor.nextLine();
        System.out.print("codigo: ");
        codigo = leitor.nextLine();
        do {
        System.out.print("mes: ");
        mes = leitor.nextInt();
        System.out.print("ano: ");
        ano = leitor.nextInt();
        invalido = ((ano<anoatual) || (ano==anoatual && mes <mesatual));
        if (invalido) System.out.println("cartao invalido insira os dados novamente");
        } while (invalido);    
        
        System.err.println("cartao validado");


        System.out.println(nome);
        System.out.println(numero);
        System.out.println(codigo);
        leitor.close();
    }

}
