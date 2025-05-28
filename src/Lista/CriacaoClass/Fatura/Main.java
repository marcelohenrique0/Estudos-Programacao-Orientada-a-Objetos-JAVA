package Lista.CriacaoClass.Fatura;

public class Main {
    public static void main(String[] args) {
        Fatura cartao = new Fatura(12355, "Cartao de credito do banco do Brasil", -1, 15.5f);

        System.out.println("O Valor da fautura é de " + cartao.calculaTotal());


    }

}
