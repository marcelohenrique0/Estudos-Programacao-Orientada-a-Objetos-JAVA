package Lista.CriacaoClass.Lampada;

public class Lampada {

    private boolean estadoDalampada;
    private Contador contador;
    Lampada(){
        this.estadoDalampada = false;
        this.contador = new Contador();
    }

    void acender(){
        if(estadoDalampada == true){
            System.out.println("A lampada ja está acendida");
        }else{
            estadoDalampada = true;
            contador.icremento();
        }
    }

    void apagar(){
        if(estadoDalampada == false){
            System.out.println("A lampada ja está apagada");
        }else{
            estadoDalampada = false;
        }
    }

    void mostraEstrado(){
        if(estadoDalampada == true){
            System.out.println("A lampada está acendida");
            System.out.println("O total de vez que essa lampada foi acesa é de " + contador.getValor());
        }else{
            System.out.println("A lampada está apagada");
        }
    }



}
