package Aulas.automovel;

public class AutomovelLuxo  extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;
    public AutomovelLuxo(String modelo, String cor, int ano, boolean airBag, boolean radio, boolean arCondicionado,boolean direcaoHidraulica) {
        super(modelo, cor, ano, airBag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }


    public float quantoCusta(){
        float custo = super.quantoCusta();
        if(arCondicionado) custo += 10000;
        if(direcaoHidraulica) custo += 15000;

        return custo;
    }


    @Override
    public String toString() {
        String res = " arCondicionado=" + arCondicionado;
        res += " direcaoHidraulica=" + direcaoHidraulica;
        res += " Custo: " + quantoCusta();
        res += " Cor: " + getCor();
        res += " Ano: " + getAno();
        res += " Airbag: " + isAirBag();
        res += " Radio: " + isRadio();


        return  res;
    }

    

    

}
