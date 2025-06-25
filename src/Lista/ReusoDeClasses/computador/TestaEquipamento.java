package Lista.ReusoDeClasses.computador;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento teclado = new Equipamento("Teclado", "Logitech");
         Computador meuPc = new Computador("PC Gamer","Dell","Intel Core i7","16GB DDR4");


        System.out.println(teclado);
        System.out.println(meuPc);
    }

}
