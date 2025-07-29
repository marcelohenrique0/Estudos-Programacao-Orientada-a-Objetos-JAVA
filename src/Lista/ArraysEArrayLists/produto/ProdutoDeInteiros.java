package Lista.ArraysEArrayLists.produto;

public class ProdutoDeInteiros {

    // staic melhor para poder utilizar enm outras classes:

    public static int Produto(int... numero) {
        int produto = 1;
        for (int numeroAtual : numero) {
            produto = produto * numeroAtual;
        }
        return produto;
    }

}
