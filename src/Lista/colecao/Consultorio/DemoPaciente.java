package Lista.colecao.Consultorio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class DemoPaciente {

    public static void main(String[] args) {
        Queue<Paciente> filaComum = new LinkedList<>();
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Random gerador = new Random();
        final int TOTAL_PACIENTES_DIA = 20;
        final int TEMPO_CONSULTA = 5;
        final int INTERVALO_CHEGADA = 4;

        int pacientesAtendidos = 0;
        int minutoAtual = 0;
        int proximaChegada = 0;
        int tempoRestanteConsulta = 0;
        Paciente pacienteEmAtendimento = null;

        while (pacientesAtendidos < TOTAL_PACIENTES_DIA) {

            if (minutoAtual >= proximaChegada) {
                int idade = gerador.nextInt(100) + 1;
                int rg = 1000000 + gerador.nextInt(9000000);
                Paciente novoPaciente = new Paciente(rg, idade);

                if (novoPaciente.getIdade() > 60) {
                    filaPrioritaria.add(novoPaciente);
                    System.out.println(
                            "Minuto " + minutoAtual + "\nChegou " + novoPaciente + " e foi para a fila PRIORITÁRIA.");
                } else {
                    filaComum.add(novoPaciente);
                    System.out.println(
                            "\nMinuto " + minutoAtual + "\nChegou " + novoPaciente + " e foi para a fila COMUM.");
                }

                proximaChegada += INTERVALO_CHEGADA;
            }

            if (pacienteEmAtendimento != null) {
                tempoRestanteConsulta--;
                if (tempoRestanteConsulta == 0) {
                    System.out.println(
                            "Minuto " + minutoAtual + "\nConsulta do " + pacienteEmAtendimento + " FINALIZADA.");
                    pacientesAtendidos++;
                    pacienteEmAtendimento = null;
                }
            }

            if (pacienteEmAtendimento == null) {
                Paciente proximo = null;

                if (!filaPrioritaria.isEmpty()) {
                    proximo = filaPrioritaria.poll();
                } else if (!filaComum.isEmpty()) {
                    proximo = filaComum.poll();
                }

                if (proximo != null) {
                    pacienteEmAtendimento = proximo;
                    tempoRestanteConsulta = TEMPO_CONSULTA;
                    System.out.println(
                            "\nMinuto " + minutoAtual + "\nMédico chamou para consulta: " + pacienteEmAtendimento);
                }
            }

            minutoAtual++;
        }

        System.out.println("\nConsultório fechado! Total de " + pacientesAtendidos + " pacientes atendidos hoje. ");
    }

}
