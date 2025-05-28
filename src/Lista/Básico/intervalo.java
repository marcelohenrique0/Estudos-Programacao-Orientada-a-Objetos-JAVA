package Lista.Básico;

import java.util.Scanner;

/* 

    EXPLICAÇÃO DOS CALCULOS: 

    1. Sabemos que:
       - 1 dia = 24 horas = 1440 minutos (24 x 60)

    2. Para calcular o total de dias:
       - Divida o total de minutos por 1440 (minutos de um dia).
       - A parte inteira do resultado dessa divisão representa o total de dias completos.

    3. Para calcular os minutos restantes após determinar os dias:
       - Subtraia o total de minutos dos dias completos (dias * 1440).
       - O resultado será o número de minutos restantes.

    4. Para calcular o total de horas:
       - Divida os minutos restantes por 60 (minutos de uma hora).
       - A parte inteira do resultado será o total de horas.

    5. Para calcular os minutos restantes após determinar as horas:
       - Subtraia o total de minutos correspondentes às horas completas (horas * 60) dos minutos restantes.
       - O resultado será o total de minutos restantes.

    Exemplificando:
       - Se você tem 5000 minutos:
         - Dias: 5000 / 1440 = 3 dias
         - Minutos restantes após dias: 5000 - (3 * 1440) = 680 minutos
         - Horas: 680 / 60 = 11 horas
         - Minutos restantes após horas: 680 - (11 * 60) = 20 minutos

*/


public class intervalo {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite os minutos: ");

        int minutos = leitor.nextInt();


        int dias = minutos / 1440; 
        
        int minutosRestantes = minutos- (dias * 1440);

        int horas = minutosRestantes / 60;

        minutosRestantes -= (horas * 60);    

        System.out.println( dias + " DIAS "  + horas + " HORAS: "  + minutosRestantes + " MINUTOS: ");

        leitor.close();
    }

}
