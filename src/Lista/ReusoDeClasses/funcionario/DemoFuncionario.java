package Lista.ReusoDeClasses.funcionario;

public class DemoFuncionario {

    public static void main(String[] args) {

        Assistente as1 = new Assistente("Carlos Silva", 2000f, 101);

        Administrativo ad1 = new Administrativo("Ana Costa", 2000f, 102, "noite", 300f);

        Administrativo ad2 = new Administrativo("Beatriz Lima", 2000f, 103, "dia", 300f);

        Tecnico t1 = new Tecnico("Jorge Paiva", 3000f, 201, 500f);

        System.out.println(as1);

        System.out.println(ad1);

        System.out.println(t1);

        System.out.println(ad2);

    }

}
