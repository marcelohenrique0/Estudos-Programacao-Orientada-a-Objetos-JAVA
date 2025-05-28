package Aulas.introducao;

public class calculodeDistancia {

    public static void main(String[] args) {
        double kph = 0.0, mps;

        System.out.println("K/h \tM/s");
        while (kph <= 50) {
            mps = kph * 0.2778;

            if ((mps >= 0 && mps < 10) && (kph >= 0 && kph < 10)){
                System.out.printf("0%.2f \t 0%.3f\n", kph, mps);

            }else if(mps >= 0 && mps < 10){
                System.out.printf("%.2f \t 0%.3f\n", kph, mps);
            }else{
                System.out.printf("%.2f \t %.3f\n", kph, mps);

            }
            kph += 0.5;    

        }

        
    }
}
