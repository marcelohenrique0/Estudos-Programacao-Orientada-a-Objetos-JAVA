package Lista.ReusoDeClasses.datahorario;

public class DemoDataHora {
    public static void main(String[] args) {

        EventoHerenca evento1 = new EventoHerenca("18:22", "22/06/2025", "Aniversario de Raquel");
        EventoDelegacao evento2 = new EventoDelegacao("22:00", "12/06/2025", "Fim dos Dias dos Namorados");

        System.out.println(evento1);
        System.out.println(evento2);

    }

}
