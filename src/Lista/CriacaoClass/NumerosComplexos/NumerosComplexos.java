package Lista.CriacaoClass.NumerosComplexos;

public class NumerosComplexos {

    private double real;
    private double imaginario;

    NumerosComplexos(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    
    NumerosComplexos(double real){
        this.real = real;
        this.imaginario = 0;
    }

    NumerosComplexos(){
        this.real = 0;
        this.imaginario = 0;
    }



    public String toString(){
        return real + " + " + imaginario + "i ";
    }


}
