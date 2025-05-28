package Aulas.CriacaoClass.Datas;



public class Data {

    private int dia;
    private int mes;
    private int ano;

    private boolean dataValida() {
        return (dia >0 && dia <= 30 && mes > 0 && mes <= 12 &&  ano > 0);

    }


    // recebendo variavle externa

    public void inicializaData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;

        if(!this.dataValida()){

            dia = 1;
            mes = 1;
            ano = 2000;
        }

    }

    public void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }


}
