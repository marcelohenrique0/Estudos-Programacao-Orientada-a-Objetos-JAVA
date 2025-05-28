package Lista.Básico;

import java.util.Scanner;

public class DiadoMesFevereiro {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite a data (1 a 28) do mês de fervereiro de 2015: ");

        int dia = leitor.nextInt();

        if(dia == 2 || dia ==  9 || dia == 16 || dia == 23){
            System.out.println("O dia " + dia + " será uma Segunda-Feira");
        }else if(dia == 3 || dia ==  10 || dia == 17 || dia == 24){
            System.out.println("O dia " + dia + " será uma Terça-Feira");
        }else if(dia == 4 || dia ==  11 || dia == 18 || dia == 25){
            System.out.println("O dia " + dia + " será uma Quarta-Feira");
        }else if(dia == 5 || dia ==  12 || dia == 19 || dia == 26){
            System.out.println("O dia " + dia + " será uma Quinta-Feira");
        }else if(dia == 6 || dia ==  13 || dia == 20 || dia == 27){
            System.out.println("O dia " + dia + " será uma Sexta-Feira");
        }else if(dia == 7 || dia ==  14 || dia == 21 || dia == 28){
            System.out.println("O dia " + dia + " será uma Sábado");
        }else if(dia == 1 || dia ==  15 || dia == 22 || dia == 8){
            System.out.println("O dia " + dia + " será uma Domingo");
        }else{
            System.out.println("Esse dia não está no Calendario");
        }





        leitor.close();
    }

}
