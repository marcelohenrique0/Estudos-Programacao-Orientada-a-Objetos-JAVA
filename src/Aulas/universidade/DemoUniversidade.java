package Aulas.universidade;

public class DemoUniversidade {

    public static void main(String[] args) {
        
        RegistroAcademico registro1 = new RegistroAcademico("Thyago", "1251251sfsa", "TI");

        RegistroAcademicoPosGraducao posGraducao1 = new RegistroAcademicoPosGraducao(registro1, "IA nas escolas", "Bruno xavier");

        System.out.println(posGraducao1);


        RegistroAcademicoPosGraducao posGraduando2 = new RegistroAcademicoPosGraducao("thyago", "202301921", "BTI", "programador", "italo");

        System.out.println(posGraduando2);



    }


}
