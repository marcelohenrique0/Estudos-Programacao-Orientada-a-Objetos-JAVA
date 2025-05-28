package Aulas.CriacaoClass.EventoAcademico;

public class Evento2 {
    private String nomeDoEvento;
    private String localDoEvento;
    private int numeroDeParticipante;

    Evento2(String nomeDoEvento, String localDoEvento, int numeroDeParticipante){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = (localDoEvento.isEmpty() ? "UFERSA" : localDoEvento);
        this.numeroDeParticipante = (numeroDeParticipante> 0 ? numeroDeParticipante: 1);
        this.mostrarEvento();

    }

    public void mostrarEvento(){
        System.out.println("Nome: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Participantes: "+ numeroDeParticipante);
    }

}
