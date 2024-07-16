package FichaPratica09.Ex01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrio;
    private int potencia;
    private int cilindrada;
    private String tipoCombustivel;
    private int litros100km;

    public Carro(String marca, String modelo, int anoFabrio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrio = anoFabrio;
    }

    public void ligar(){
        System.out.println("O carro esta ligado.");
    }
}
