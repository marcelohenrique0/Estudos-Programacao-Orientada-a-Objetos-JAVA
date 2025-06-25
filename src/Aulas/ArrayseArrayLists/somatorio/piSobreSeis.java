package Aulas.ArrayseArrayLists.somatorio;

public class piSobreSeis {

    public static void main(String[] args) {
        double termosDaSerie[] = new double[100000];


        for(int i  = 0; i < termosDaSerie.length; i++){
            termosDaSerie[i] = 1/Math.pow(i + 1, 2); // i + 1 é pq o primeiro elemento é zero
        }

        for(int num = 10; num <= 100000;    ){
            calculaEMostraSomatoria(termosDaSerie, num);
        }


        System.out.println(Math.pow(Math.PI, 2)/6);

        calculaEMostraSomatoria(termosDaSerie, 10);




    }

    public static void calculaEMostraSomatoria(double array [], int num){
        double soma = 0.0;

        for(int i = 0; i < num; i++){
            soma += array[i];

        }


        System.out.println("A soma dos  " + num + " primeiros elementos " + soma );

    }
}


