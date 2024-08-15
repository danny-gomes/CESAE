package FichaPratica09.Ex01;

import FichaPratica08.Ex01.Pessoa;

import java.time.Year;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrio;
    private int potencia;
    private int cilindrada;
    private tipoCombustivel combustivel;
    private int litros100km;

    public Carro(String marca, String modelo, int anoFabrio, int potencia, int cilindrada, tipoCombustivel combustivel, int litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrio = anoFabrio;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros100km = litros100km;
    }

    public void ligar() {
        int ano = Year.now().getValue();
        if ((ano - this.anoFabrio) > 30) {
            if (this.combustivel == tipoCombustivel.DIESEL) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro esta ligado!");
                System.out.println("Vrum-vrum-vrum!");
            } else {
                System.out.println("Custa a pegar... O carro esta ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        } else {
            if (this.potencia < 250) {
                System.out.println("O carro esta ligado!");
                System.out.println("Vruuuuuum!");
            } else {
                System.out.println("O carro esta ligado!");
                System.out.println("VRUUUUUUUUM!");
            }
        }
    }

    public Carro corrida(Carro competidor) {
        if (this.potencia > competidor.potencia) {
            return this;
        } else if (this.potencia < competidor.potencia) {
            return competidor;
        }

        if (this.cilindrada > competidor.cilindrada) {
            return this;
        } else if (this.cilindrada < competidor.cilindrada) {
            return competidor;
        }

        if (this.anoFabrio > competidor.anoFabrio) {
            return this;
        } else if (this.anoFabrio < competidor.anoFabrio) {
            return competidor;
        }

        return null;
    }

    public double calcularCombustivel(int km){
        double qtd100km = (double) km / 100;
        return this.litros100km * qtd100km;
    }

    public String getMarca() {
        return marca;
    }

    public enum tipoCombustivel {
        DIESEL, GASOLINA, GPL
    }
}


