package Lista.ReusoDeClasses.datahorario;

public class EventoHerenca extends DataHora {
    private String nomeDoEvento;

    EventoHerenca(String hora, String data, String nomeDoEvento) {
        super(hora, data);
        this.nomeDoEvento = nomeDoEvento;

    }

    public String toString() {
        return super.toString() + "\n" + "Nome do Evento: " + nomeDoEvento;

    }

}
