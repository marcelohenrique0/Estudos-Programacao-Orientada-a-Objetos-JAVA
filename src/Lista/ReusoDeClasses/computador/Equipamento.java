package Lista.ReusoDeClasses.computador; 

public class Equipamento {
    private String nome;        
    private String fabricante; 

    Equipamento(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +  "Fabricante: " + fabricante;
    }
}