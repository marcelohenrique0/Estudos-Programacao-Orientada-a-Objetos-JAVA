package Aulas.automovel;

public class DemoAutomovel {

    public static void main(String[] args) {
        AutomovelLuxo automovelLuxo1 = new  AutomovelLuxo("Ferrari", "Vermelho", 2023, true, true, true, true);

        System.out.println(automovelLuxo1.toString());
        System.out.println("Custo: " + automovelLuxo1.quantoCusta());
    }

}
