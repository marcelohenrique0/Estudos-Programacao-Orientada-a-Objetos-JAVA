package Lista.ReusoDeClasses.pessoa;

public class DemoPessoa {

    public static void main(String[] args) {

        Governador govrn = new Governador("Fatima Bezza", "113.412.411-44", "PT", "Rio Grande do Norte");
        Pessoa pessoa1 = new Pessoa("Gustavo fontes", "112.003.443-22");
        Politico politico1 = new Politico("Dinarte", "112.233.331-22", "PL");
        Prefeito prefeito1 = new Prefeito("Mariana", "123.444.555-22", "PSOL", "Pau dos Ferros - RN");


        System.out.println("Dados de pessoa");

        System.out.println(pessoa1);

        System.out.println("Dados de Prefeito ");

        System.out.println(prefeito1);

        System.out.println("Dados de um politico");

        System.out.println(politico1);

        System.out.println("Dados de um Governadora ");

        System.out.println(govrn);

        



    }

}
