package Aulas.CriacaoClass.CaixaBanco;

public class CaixaBanco {
    public static int clientesAtendidos = 0;
    private int numeroCaixa;

    CaixaBanco (int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
        System.out.println("Caixa "+ numeroCaixa + " Atendendo " + (++clientesAtendidos) );
    }

    @Override
    public String toString() {
        return "numeroCaixa= " + numeroCaixa;
    }

    

}
