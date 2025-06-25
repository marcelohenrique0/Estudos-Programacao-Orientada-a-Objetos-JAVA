package Lista.ReusoDeClasses.datahorario;

public class EventoDelegacao {
    private DataHora data;
    private String nomeDoEvento;

    EventoDelegacao(String hora, String data, String nomeDoEvento){
        this.data = new DataHora(hora, data);
        this.nomeDoEvento = nomeDoEvento;
        
    }

    public String toString(){
        return data.toString() + "\n" + "Nome do Evento: " + nomeDoEvento;
    }



}
