package FichaPratica11.Ex02;

public class Camiao extends Veiculo {
    protected int capacidadeCargaKg;

    public Camiao(String marca, String modelo, int anoFabrio, int potencia, int cilindrada, TipoCombustivel combustivel, int litros100km, int capacidadeCargaKg) {
        super(marca, modelo, anoFabrio, potencia, cilindrada, combustivel, litros100km);
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public double viagem(int distancia, int carga) {
        if(carga > this.capacidadeCargaKg){
            System.out.println("Muita areia para o meu camiao.");
            return -1;
        }

        double combExtra = ((double) carga / 100) * 0.1;

        double litros = super.calcularCombustivel(distancia);
        litros = litros + combExtra;

        return litros * 1.95;
    }
}
