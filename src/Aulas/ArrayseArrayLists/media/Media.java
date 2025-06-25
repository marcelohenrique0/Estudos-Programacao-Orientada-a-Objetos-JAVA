package Aulas.ArrayseArrayLists.media;

public class Media {
    public static void main(String[] args) {

        System.out.println("Sua media: " + media(7,8,9));
        System.out.println("Sua media: " + media(7,3,5,6,9));

        

    }

    public static double media(double... notas){
        double soma = 0;
        for(double atualNotas : notas){
            soma += atualNotas;


        }

        return soma / notas.length;


    }

}
