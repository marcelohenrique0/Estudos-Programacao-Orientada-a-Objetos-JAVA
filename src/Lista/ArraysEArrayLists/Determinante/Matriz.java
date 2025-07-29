package Lista.ArraysEArrayLists.Determinante;

public class Matriz {

    private float matriz[][];
    private static int linha = 2;
    private static int coluna = 2;

    Matriz(float valor1, float valor2, float valor3, float valor4) {
        this.matriz = new float[linha][coluna];
        this.matriz[0][0] = valor1;
        this.matriz[0][1] = valor2;
        this.matriz[1][0] = valor3;
        this.matriz[1][1] = valor4;
    }

    public float calcularDeterminante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
    }

    public void impressao() {
        for (int l = 0; l < linha; l++) {// linha
            for (int j = 0; j < coluna; j++) {// coluna
                System.out.printf(" %.2f ", matriz[l][j]);
            }
            System.out.println();
        }
    }

}
