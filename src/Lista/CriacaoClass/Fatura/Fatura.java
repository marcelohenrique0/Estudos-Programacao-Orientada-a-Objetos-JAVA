package Lista.CriacaoClass.Fatura;

public class Fatura {
    int numeroDeIdentificao;
    String descricao;
    int quantidadeComprada;
    float precoUnitario;

    Fatura(int numeroDeIdentificao, String descricao, int quantidadeComprada, float precoUnitario){
        this.numeroDeIdentificao = numeroDeIdentificao;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada > 0 ? quantidadeComprada: 0 ;
        this.precoUnitario = precoUnitario > 0 ? precoUnitario: 0;

    }

    float calculaTotal (){
        return quantidadeComprada * precoUnitario;
    }





}
