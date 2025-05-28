package Lista.CriacaoClass.TimedeFutebol;

import java.util.Random;

public class Time {
    
    String nomeDoTime;
    int numeroDeJogadores;
    String competicao;

    Time(String nomeDotime, int numeroDeJogadores, String competicao ){

        this.nomeDoTime = nomeDotime;
        this.numeroDeJogadores = numeroDeJogadores;
        this.competicao = competicao;

    }

    void dadosDoTime(){
        System.out.println("===================Dados do Time de Futebol===================");
        System.out.println("Nome do Time: " + nomeDoTime);
        System.out.println("Total de Jogadores registrados: " + numeroDeJogadores);
        System.out.println("Campeonato que está disputando: " + competicao);
    }

    void simularUmjogo(String nomeTimeFora){
        Random rand = new Random();
        int PlacaTimeCasa = rand.nextInt(10);
        int PlacaTimeFora = rand.nextInt(10);


        System.out.printf("%s %s x %s %s", nomeDoTime,PlacaTimeCasa,PlacaTimeFora,nomeTimeFora);

    }


    
}
