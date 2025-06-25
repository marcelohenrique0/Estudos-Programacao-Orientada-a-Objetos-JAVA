package Aulas.empresa;

public class DemoEmpresa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Thyago", "12345512");
        Funcionario funcionario = new Funcionario("Gustavo", "092141", 20000);
        ChefeDeDepartamento chefeDeDepartamento = new ChefeDeDepartamento("Marcelo", "0213411", 5000, "TI");

        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(chefeDeDepartamento);
    }

}
