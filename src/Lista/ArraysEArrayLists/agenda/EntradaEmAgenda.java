package Lista.ArraysEArrayLists.agenda;

import javax.swing.text.html.HTMLDocument.RunElement;

public class EntradaEmAgenda {

    private String horas;
    private int dia;
    private int mes;
    private int ano;
    private String assunto;

    EntradaEmAgenda(String horas, int dia, int mes, int ano, String assunto) {
        this.horas = horas;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public String toString() {
        return "Horas: " + horas + "\n" + "Dia: " + dia + "\n" + "Mes: " + mes + "\n" + "Ano: " + ano + "\n"
                + "Assunto: " + assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }

}
