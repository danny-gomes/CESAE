package FichaPratica11.Ex02;

public class Carro extends Veiculo {
    protected int qtdPassageiros;

    public Carro(String marca, String modelo, int anoFabrio, int potencia, int cilindrada, TipoCombustivel combustivel, int litros100km, int qtdPassageiros) {
        super(marca, modelo, anoFabrio, potencia, cilindrada, combustivel, litros100km);
        this.qtdPassageiros = qtdPassageiros;
    }

    public double calcularCusto(int km) {
        double litrosUsados = super.calcularCombustivel(km);

        switch (this.combustivel) {
            case TipoCombustivel.DIESEL:
                return litrosUsados * 2.10;
            case TipoCombustivel.GASOLINA:
                return litrosUsados * 1.95;
            case TipoCombustivel.GPL:
                return litrosUsados * 1.15;
            case TipoCombustivel.ELETRICO:
                return litrosUsados * 0.12;
        }

        return -1;
    }
}
