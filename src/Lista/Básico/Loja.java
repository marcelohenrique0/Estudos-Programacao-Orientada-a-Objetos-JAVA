package Lista.Básico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o codigo do setor: ");
        int codigo = leitor.nextInt();

        System.out.print("Valor do produto: ");
        float valor = leitor.nextFloat();

        double desconto;

        DecimalFormat formato = new DecimalFormat("00.00"); 

        switch (codigo) {
            case 111:
                System.out.println("Setor de cama,mesa e banho ");
                if(valor > 100){

                    desconto =  (valor * 0.4);
                    valor -= desconto;
                    System.out.println("com desconto de 40% o valor do produto fica: " + formato.format(valor)+ "$");

                }else if(valor >= 50 && valor <= 100 ){
                    desconto =  (valor * 0.2);
                    valor -= desconto;
                    System.out.println("com desconto de 20% o valor do produto fica: " + formato.format(valor)+ "$");
                }else{
                    desconto =  (valor * 0.1);
                    valor -= desconto;
                    System.out.println("com desconto de 10% o valor do produto fica: " + formato.format(valor)+ "$");
                }
                
                break;
            
            case 222:
                System.out.println("Setor de Eletros");
                if(valor > 500){
                    desconto =  (valor * 0.1);
                    valor -= desconto;
                    System.out.println("com desconto de 10% o valor do produto fica: " + formato.format(valor)+ "$");

                }else{
                    System.out.println("valor do produto fica: " + formato.format(valor)+ "$");
                }

                break;
        
            default:
                System.out.printf("Setor Invalido");
                break;
        }

        leitor.close();
    }

}
