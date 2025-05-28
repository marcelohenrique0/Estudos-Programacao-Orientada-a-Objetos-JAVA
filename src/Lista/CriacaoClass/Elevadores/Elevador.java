package Lista.CriacaoClass.Elevadores;

public class Elevador {

    private int numeroDoAndarAtual;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private int quantantidadedePessoas;

    Elevador(int capacidadeDoElevador, int totalDeAndares){
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.totalDeAndares = totalDeAndares;
        this.numeroDoAndarAtual = 0;
        this.quantantidadedePessoas = 0;
    }

    public void entrar(){
        if(quantantidadedePessoas < capacidadeDoElevador){
            quantantidadedePessoas++;
            System.out.println("Um pessoa entrou no elevador e se encontra total de pessoas prensentes no elevador é de " + quantantidadedePessoas);
        }else{
            System.out.println("Não tem mais espaço o elevador");
        }
    }

    public void sai(){
        if(quantantidadedePessoas > 0){
            quantantidadedePessoas--;
            System.out.println("Um pessoa acabou de sai do elevador e agora se encontra um total de pessoa nele de " + quantantidadedePessoas);
        }else{
            System.out.println("Elevador está vazio");
        }
    }


    public void sobe(){
        if(numeroDoAndarAtual <= totalDeAndares){
            numeroDoAndarAtual++;
            System.out.println("O elevador subiu mais um andar e se encontra no andar " + numeroDoAndarAtual);
        }else{
            System.out.println("O elevador já está no último andar");
        }
    }


    public void descer(){
        if(numeroDoAndarAtual != 0 && numeroDoAndarAtual <=  totalDeAndares){
            numeroDoAndarAtual--;
            System.out.println("O elevador desceu um andar e se encontra no andar " + numeroDoAndarAtual);
        }else{
            System.out.println("O elevador já está no térreo");
        }
    }



}
