package Lista.Básico;

import java.util.Scanner;

public class PontoCartesiano {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite ponto X1: ");
        int x1 = leitor.nextInt();

        System.out.print("Digite ponto Y1: ");
        int y1 = leitor.nextInt();

        System.out.println("Agora digite as Coordendas do segundo ponto");

        System.out.print("Digite ponto X2: ");
        int x2 = leitor.nextInt();

        System.out.print("Digite ponto Y2: ");
        int y2 = leitor.nextInt();


        if(x1== x2 && y1 == y2){
            System.out.println("O ponto 2 está no mesmo lugar do Ponto 1");
        }else{
            if (x2 > x1) {
                System.out.print("O ponto 2 está à direita");
                
            }else if(x2 < x1){
                System.out.print("O ponto 2 está à esquerda");

            }

            if(y2 > y1){
                System.out.print(" e acima do ponto 1.");
            }else if(y2 < y1){
                System.out.print(" e abaixo do ponto 1.");
            }
            
        }






        leitor.close();
    }

}
