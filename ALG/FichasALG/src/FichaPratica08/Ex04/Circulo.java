package FichaPratica08.Ex04;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return this.raio * this.raio * Math.PI;
    }

    public double perimetro() {
        return 2 * Math.PI * this.raio;
    }
}
