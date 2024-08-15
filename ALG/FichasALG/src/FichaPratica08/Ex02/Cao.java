package FichaPratica08.Ex02;

public class Cao {
    private String nome;
    private String raca;
    private String latido = "Au au au!";

    public Cao(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public void latir(){
        System.out.println(latido);
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }
}
