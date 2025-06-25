package Aulas.automovel;

public class AutomovelBasico extends Automovel{

    private boolean airBag;
    private boolean radio;

    public AutomovelBasico(String modelo, String cor, int ano, boolean airBag, boolean radio) {
        super(modelo, cor, ano);
        this.airBag = airBag;
        this.radio = radio;
    }


    @Override // sabe que existe outro metodo custo e vai avisar caso tenha um erro de digitação 
    public float quantoCusta(){
        float custo = super.quantoCusta();
        if(airBag) custo += 15000;
        if(radio) custo += 2000;

        return custo;
    }


    public boolean isAirBag() {
        return airBag;
    }


    public boolean isRadio() {
        return radio;
    }


    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }


    public void setRadio(boolean radio) {
        this.radio = radio;
    }
    

}
