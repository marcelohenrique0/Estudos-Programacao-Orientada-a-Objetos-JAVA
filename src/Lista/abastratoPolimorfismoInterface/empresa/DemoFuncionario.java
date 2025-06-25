package Lista.abastratoPolimorfismoInterface.empresa;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Raquel");
        Funcionario funcionario2 = new Funcionario("Marcelo", 200.00);
        Funcionario funcionario3 = new Funcionario("Thyago", 300.00, 10);

        System.out.println("Funcionario 1");
        System.out.println(funcionario1);

        System.out.println("Funcionario 2");
        System.out.println(funcionario2);

        System.out.println("Funcionario 3");
        System.out.println(funcionario3);
    }

}
