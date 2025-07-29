package Lista.ArraysEArrayLists.produto;

public class DemoProduto {
    public static void main(String[] args) {

        // Frases corrigidas para ficarem iguais ao gabarito
        System.out.println("Produto de (1, 2, 3, 4, 5, 6): " + ProdutoDeInteiros.Produto(1, 2, 3, 4, 5, 6));
        System.out.println("Produto de (5, 6): " + ProdutoDeInteiros.Produto(5, 6));
        System.out.println("Produto de (1, 4, 5, 6): " + ProdutoDeInteiros.Produto(1, 4, 5, 6));
        System.out.println("Produto de (1, 8, 10, 20): " + ProdutoDeInteiros.Produto(1, 8, 10, 20));

    }
}