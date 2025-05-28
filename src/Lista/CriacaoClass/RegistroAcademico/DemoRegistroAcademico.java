package Lista.CriacaoClass.RegistroAcademico;

public class DemoRegistroAcademico {

    public static void main(String[] args) {
        
        RegistroAcademico aluno1 = new RegistroAcademico("Thaygo", 234, 12,111);
        RegistroAcademico aluno2 = new RegistroAcademico("Marcelo", 234, 20,222);
        RegistroAcademico aluno3 = new RegistroAcademico("Dinarte", 234, 10,333);

        aluno1.calulaMensalidade();
        aluno2.calulaMensalidade();
        aluno3.calulaMensalidade();
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());

        System.out.println("Total de Matricula " + RegistroAcademico.getTotalDeMatriculas());
        

    }



}
