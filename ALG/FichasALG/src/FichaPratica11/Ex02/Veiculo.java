package FichaPratica11.Ex02;

import FichaPratica09.Ex01.Carro;

import java.time.Year;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabrico;
    protected int potencia;
    protected int cilindrada;
    protected TipoCombustivel combustivel;
    protected int litros100km;

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo, int anoFabrio, int potencia, int cilindrada, TipoCombustivel combustivel, int litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrio;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros100km = litros100km;
    }

    public void ligar() {
        int ano = Year.now().getValue();
        if ((ano - this.anoFabrico) > 30) {
            if (this.combustivel == TipoCombustivel.DIESEL) {
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

    public Veiculo corrida(Veiculo competidor) {
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

        if (this.anoFabrico > competidor.anoFabrico) {
            return this;
        } else if (this.anoFabrico < competidor.anoFabrico) {
            return competidor;
        }

        return null;
    }

    public double calcularCombustivel(int km) {
        double qtd100km = (double) km / 100;
        return this.litros100km * qtd100km;
    }

    public String getMarca() {
        return marca;
    }

    public void exibirDetalhes(){
        System.out.println("MARCA: " + this.marca + " MODELO: " + this.modelo);
    }
}
