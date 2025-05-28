package Aulas.CriacaoClass.faculdade;

public class DemoRegistroAcademico {

    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "00931234", 2, 60);

        double valor = michael.calulaMensalidade();

        System.out.println("Valor da Mensalidade de Michael: " +valor);



        RegistroAcademico roberto = new RegistroAcademico();

        double valor2 = roberto.calulaMensalidade();

        System.out.println("Valor da Mensalidade de Michael: " +valor2);
    }

}
