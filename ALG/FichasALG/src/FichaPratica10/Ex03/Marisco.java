package FichaPratica10.Ex03;

public class Marisco {
    private String especie;
    private double peso;
    private double precoKg;

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public Marisco(String especie, double peso, double precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }
}
