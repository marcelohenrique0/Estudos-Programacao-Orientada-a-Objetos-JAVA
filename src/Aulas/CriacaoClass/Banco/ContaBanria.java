package Aulas.CriacaoClass.Banco;

public class ContaBanria {
    private String nome;
    private float saldo;
    private boolean especial; 


    public ContaBanria(String nome, float saldo, boolean especial){
        this.nome = nome;
        
        this.saldo = saldo;

        this.especial = especial;
    }


    
    public ContaBanria(String nome){
        this.nome = nome;
        
        this.saldo = 0.0f;

        this.especial = false;
    }

    

    @Override
    public String toString(){
        return "Nome: " + nome + "\n saldo: " + saldo + "\n especial = " + (especial?"sim":"não");

    }


}
