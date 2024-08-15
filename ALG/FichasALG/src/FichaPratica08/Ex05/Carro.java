package FichaPratica08.Ex05;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrio;

    public Carro(String marca, String modelo, int anoFabrio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrio = anoFabrio;
    }

    public void ligar(){
        System.out.println("O carro esta ligado.");
    }
}
