package Aulas.ArrayseArrayLists.dama;

import java.util.Arrays;

public class Tabuleiro {

    private char tab[][];
    private static final int LIN = 8;
    private static final int COL = 8;

    public Tabuleiro() {
        tab = new char[LIN][COL];
        for (int L = 0; L < tab.length; L++) {
            for (int C = 0; C < tab[L].length; C++) {
                tab[L][C] = '.';
                
            }

        }


        for(int l = 0 ; l <= 2; l++){
            for(int c = 1%2; c < tab[l].length  ; c+=2 ){
                tab[l][c] = 'o';

            }
        }


        for(int l = 5; l  <= 7; l++){
            for(int c = 1%2; c < tab[l].length; c+=2){
                tab[l][c] = 'x';
            }
        }
    }

    @Override
    public String toString() {
        String rep = "";

        for(int L = 0; L < tab.length; L++){
            for(int C = 0; C < tab[L].length; C++){
                rep += tab[L][C] + " ";
                

            }

            rep += "\n";
            
        }

        return rep;
    }

}
