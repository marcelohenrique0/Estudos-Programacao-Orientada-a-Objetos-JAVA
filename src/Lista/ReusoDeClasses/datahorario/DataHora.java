package Lista.ReusoDeClasses.datahorario;

public class DataHora {
    private String hora;
    private String data;

    DataHora(String hora, String data){
        this.hora = hora;
        this.data = data;

    }

    public String toString(){
        return "Hora: " + hora + "\n" + "Data: " + data;
    }

}
