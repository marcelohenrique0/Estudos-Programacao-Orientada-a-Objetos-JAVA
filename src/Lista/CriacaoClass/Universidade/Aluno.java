package Lista.CriacaoClass.Universidade;

public class Aluno {
    int matricula;
    String nome;
    double nota1,nota2,notaDeTrabalho;

    Aluno(String nome,int matricula, double nota1, double nota2, double notaDeTrabalho){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaDeTrabalho = notaDeTrabalho;
    }

    public double media(){
        return (2.5*nota1 + 2.5*nota2 + 2*notaDeTrabalho)/7;

    }
    
    public double provaFinal(){

        double media = this.media();

        if(this.media() <3 || this.media() >= 7 ){
            return 0;
        }else{
            
            return (50 - 6 * media) /4;
        }

        
    }


    void impriDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota de Trabalho: " + notaDeTrabalho);
        System.out.printf("Media Parcial %.2f %n", media());

        if(provaFinal() == 0){
            System.out.println("Aluno não precisa realizar exame final");
        }else{
            System.out.printf("Aluno precisa de %.2f  no exame final para ser aprovado", provaFinal());
        }

    }

    

}
