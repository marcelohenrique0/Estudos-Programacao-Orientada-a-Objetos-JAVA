package Aulas.Abstrato.Empresa;

public class DemoEmpresa {

    public static void main(String[] args) {
        Assalariado a = new Assalariado("GUSTAVO FONTES", "GA124A", 2130.89F);

        Fatura f = new Fatura(222.0F, 5);

        imprimiCustoPagamento(a);
        imprimiCustoPagamento(f);
    }

    public static void imprimiCustoPagamento(Pagavel pag){
        System.out.println("Custo do pagamento é " + pag.obterValorPagamento());
    }

}
