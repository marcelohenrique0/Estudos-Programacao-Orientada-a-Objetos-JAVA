package Aulas.introducao;


public class Populacao {

    public static void main(String[] args) {

        int A = 7000;
        int B = 20000;

        int contadorDeAno = 0;

        
        while(A <= B){

            int somaA = (int) (A* 0.035);
            A += somaA;

            int somaB = (int) (B * 0.01);
            B += somaB;


            contadorDeAno++;
        }

        System.out.printf("vai ser: %s anos para que população de A seja igual a população de B", contadorDeAno);
    }

}
