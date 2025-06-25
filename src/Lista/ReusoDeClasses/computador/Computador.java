package Lista.ReusoDeClasses.computador; 

public class Computador extends Equipamento { 
    private String tipoProcessador; 
    private String tamanhoMemoriaRam; 


    public Computador(String nome, String numeroSerie, String tipoProcessador, String tamanhoMemoriaRam) {
        super(nome, numeroSerie); 
        this.tipoProcessador = tipoProcessador;
        this.tamanhoMemoriaRam = tamanhoMemoriaRam;
    }


    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public String getTamanhoMemoriaRam() {
        return tamanhoMemoriaRam;
    }


    public void setTipoProcessador(String tipoProcessador) {
        this.tipoProcessador = tipoProcessador;
    }

    public void setTamanhoMemoriaRam(String tamanhoMemoriaRam) {
        this.tamanhoMemoriaRam = tamanhoMemoriaRam;
    }

    public String toString() {
        return super.toString() +  "\n Tipo de Processador: " + tipoProcessador + "\n" + "Tamanho da Memória RAM: " + tamanhoMemoriaRam;
    }
}