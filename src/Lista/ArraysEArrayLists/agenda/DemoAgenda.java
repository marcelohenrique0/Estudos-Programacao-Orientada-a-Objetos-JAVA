package Lista.ArraysEArrayLists.agenda;

public class DemoAgenda {

    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        EntradaEmAgenda compromisso1 = new EntradaEmAgenda("18:00", 01, 06, 2025, "Estudar muito");
        EntradaEmAgenda compromisso2 = new EntradaEmAgenda("18:00", 03, 07, 2025, "Ver a mulher");
        minhaAgenda.adicionarCompromisso(compromisso1);
        minhaAgenda.adicionarCompromisso(compromisso2);

        minhaAgenda.listarDia(03, 07, 2025);

        minhaAgenda.listarDia(01, 06, 2025);
    }

}
