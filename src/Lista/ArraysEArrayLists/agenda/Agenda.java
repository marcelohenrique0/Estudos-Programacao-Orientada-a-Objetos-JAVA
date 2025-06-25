package Lista.ArraysEArrayLists.agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<EntradaEmAgenda> listaDeCompromissos;
    
    Agenda(){
        this.listaDeCompromissos = new ArrayList<>();

    }


    public void adicionarCompromisso(EntradaEmAgenda novoCompromisso){
        if(novoCompromisso != null){
            this.listaDeCompromissos.add(novoCompromisso);
        }else{
            System.out.println("Sem compromisso registado! ");
        }
    }

    public void listarDia(int dia, int mes, int ano){
        for( EntradaEmAgenda compromissoDaVez : this.listaDeCompromissos){
            if(compromissoDaVez.ehNoDia(dia, mes, ano)){
                System.out.println(compromissoDaVez.toString());
            }
        }
    }


}
