package FichaPratica08.Ex03;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return 2 * (this.altura + this.largura);
    }
}
