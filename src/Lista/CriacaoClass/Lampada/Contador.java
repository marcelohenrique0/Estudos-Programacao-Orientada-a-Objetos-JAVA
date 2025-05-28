package Lista.CriacaoClass.Lampada;

public class Contador {
    private int contagemDeEventos;

    Contador(){
        this.contagemDeEventos = 0;
    }


    public void icremento(){
        contagemDeEventos++;
    }

    public void zerarContador(){
        contagemDeEventos = 0;
    }

    public int getValor(){
            return contagemDeEventos;
    }

}
