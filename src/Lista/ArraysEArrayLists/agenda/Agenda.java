package Lista.ArraysEArrayLists.agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<EntradaEmAgenda> listaDeCompromissos;

    Agenda() {
        this.listaDeCompromissos = new ArrayList<>();

    }

    public void adicionarCompromisso(EntradaEmAgenda novoCompromisso) {
        if (novoCompromisso != null) {
            this.listaDeCompromissos.add(novoCompromisso);
        } else {
            System.out.println("Sem compromisso registado! ");
        }
    }

    public void listarDia(int dia, int mes, int ano) {
        System.out.printf("\n--- Compromissos para o dia %02d/%02d/%d ---\n", dia, mes, ano);
        boolean encontrou = false;
        for (EntradaEmAgenda compromissoDaVez : this.listaDeCompromissos) {
            if (compromissoDaVez.ehNoDia(dia, mes, ano)) {
                System.out.println(compromissoDaVez.toString());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum compromisso encontrado para esta data.");
        }
    }

}
