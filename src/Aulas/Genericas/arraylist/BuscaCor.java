package Aulas.Genericas.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class BuscaCor {

    public static void main(String[] args) {

        ArrayList <String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");

        System.out.println(cores);

        Collections.sort(cores);

        System.out.println(cores);

        buscaString(cores, "cinza");
        buscaString(cores, "Vermelho");



        
    }

    public static void buscaString(ArrayList<String> arrayList, String alvo){
        if(arrayList.contains(alvo)){ // verificando se elemento está na lista
            int posicao = Collections.binarySearch(arrayList, alvo); // aqui digo em qual posição onde o alvo está na arraylist
            System.out.println(alvo + " está na posição " + posicao + " da lista"); // só funciona para arrays ordenados
        }else{
            System.out.println(alvo + " Não esta na lista");
        }
    }

}
