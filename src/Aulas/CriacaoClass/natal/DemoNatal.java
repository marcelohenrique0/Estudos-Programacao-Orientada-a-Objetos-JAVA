package Aulas.CriacaoClass.natal;

public class DemoNatal {
    public static void main(String[] args) {
        Data d1 = new Data(-13, 2, 2025);

        Data d2 = new Data(1, 1, 2026);

        if(d2 != null) System.out.println(d2);

        Data d3 = new Data(1, 1, 2025);
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        
    }


}
