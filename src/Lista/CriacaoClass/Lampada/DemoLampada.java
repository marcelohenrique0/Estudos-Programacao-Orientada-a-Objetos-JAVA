package Lista.CriacaoClass.Lampada;

public class DemoLampada {

    public static void main(String[] args) {
        Lampada lamp1 = new Lampada();

        lamp1.acender();

        lamp1.mostraEstrado();

        lamp1.apagar();

        lamp1.mostraEstrado();

        lamp1.acender();
        lamp1.mostraEstrado();
    }

}
