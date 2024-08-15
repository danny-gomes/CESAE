package FichaPratica11.Ex02;

public class Main {
    public static void main(String[] args) {
        Mota mota1 = new Mota("Honda", "CBR600RR", 2022, 118, 599, TipoCombustivel.GASOLINA, 6, 2);
        Mota mota2 = new Mota("Yamaha", "MT-07", 2019, 74, 689, TipoCombustivel.GASOLINA, 4, 2);

        // Creating Carro instances
        Carro carro1 = new Carro("Toyota", "Corolla", 2018, 132, 1798, TipoCombustivel.GASOLINA, 7, 5);
        Carro carro2 = new Carro("Tesla", "Model 3", 2021, 283, 0, TipoCombustivel.ELETRICO, 0, 5);

        // Creating Camiao instances
        Camiao camiao1 = new Camiao("Volvo", "FH16", 2015, 750, 16120, TipoCombustivel.DIESEL, 35, 30000);
        Camiao camiao2 = new Camiao("Mercedes-Benz", "Actros", 2020, 530, 12809, TipoCombustivel.DIESEL, 30, 25000);

        Veiculo veiculoVencedor = carro1.corrida(carro2);
        veiculoVencedor.exibirDetalhes();

        veiculoVencedor = mota1.corrida(camiao1);
        veiculoVencedor.exibirDetalhes();

        System.out.println("CUSTO VIAGEM CARRO: " + carro1.calcularCombustivel(150));
        System.out.println("CUSTO VIAGEM CAMIAO: " + camiao1.viagem(100,100));
        System.out.println("CUSTO VIAGEM CAMIAO invalido: " + camiao1.viagem(100,1000000));

    }
}
