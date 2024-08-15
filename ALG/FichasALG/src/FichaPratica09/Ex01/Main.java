package FichaPratica09.Ex01;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Opel","Corsa", 1912,100,46, Carro.tipoCombustivel.DIESEL,20);
        Carro c2 = new Carro("Lambraguini","Bentador", 2020,800,200, Carro.tipoCombustivel.GPL,87);

        c1.ligar();
        c2.ligar();
        System.out.println("Vencedor: " + c1.corrida(c2).getMarca());
        System.out.println("Vencedor: " + c2.corrida(c1).getMarca());
        System.out.println("Vencedor: " + (c1.corrida(c1) == null ? "Empate" : "NULL"));
        System.out.println("Litros para 12345km para opel: " + c1.calcularCombustivel(12345));
        System.out.println("Litros para 12345km para lamgarbini: " + c2.calcularCombustivel(12345));

    }
}
