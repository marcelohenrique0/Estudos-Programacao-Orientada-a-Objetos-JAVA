package Aulas.Genericas.mapa;

import java.util.TreeMap;

public class ContaPalavras {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet. Hic sint sunt et reprehenderit iste ut sequi dolore sed eveniet excepturi. Eum dolorum perspiciatis sit dolorem omnis non accusantium omnis et quis voluptas est iusto odit ut quaerat pariatur. Et deleniti sunt non aspernatur ipsam non nostrum minus.";
        TreeMap <String, Integer> mapa = new TreeMap<>();
        String palavras[] = texto.split(" ");
        for(String palavra : palavras){
            String palavraMin = palavra.toLowerCase();
            if(mapa.containsKey(palavraMin)){
                int qtd = mapa.get(palavraMin);
                mapa.put(palavraMin, qtd+1);
            }else{
                mapa.put(palavraMin, 1);

            }
        }

        for(String palavra : mapa.keySet()){
            System.out.println(palavra + " " + mapa.get(palavra));
        }

    }

}
