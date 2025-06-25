package Aulas.ArrayseArrayLists.extrato;

import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        Extrato ext = new Extrato();

        System.out.println(ext);

        float valor;

        Scanner sc = new Scanner(System.in);

        int op;
        
        do {
            
                    System.out.println("1 - saque");
                    System.out.println("2 - deposito");
                    System.out.println("3 - visualizar extrato");
                    System.out.println("4 - encerrar");
            
                    op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Qual valor do saque: ");
                    valor = sc.nextFloat();
                    ext.transacoes(-valor);

                    break;
                case 2:
                    System.out.print("Qual valor do Deposito: ");
                    valor = sc.nextFloat();
                    ext.transacoes(valor);
                    break;
                case 3:
                    System.out.println(ext);
                    break;

                case 4:
                    System.out.println("Encerar aplicação");
                    break;
                default:
                    System.out.println("opção Invalida");
                    break;
            }

        } while (op != 4);

        sc.close();

    }

}
