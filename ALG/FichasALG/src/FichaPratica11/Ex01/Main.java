package FichaPratica11.Ex01;

public class Main {
    public static void main(String[] args) {
        // Creating AviaoCombate instances
        AviaoCombate aviaoCombate1 = new AviaoCombate(
                "AC1234", "F-16", 2010, 9000, 15, 10, 5, 2, 2000, 1500, "USA", true, 18_000_000);
        AviaoCombate aviaoCombate2 = new AviaoCombate(
                "AC5678", "Su-35", 2015, 9500, 16, 11, 5.5, 2, 2500, 1600, "Russia", false, 20_000_000);

        // Adding weapons to aviaoCombate1
        aviaoCombate1.addArma("Missile");
        aviaoCombate1.addArma("Cannon");
        aviaoCombate1.addArma("Bomb");

        // Trying to add another weapon to aviaoCombate1 (should show "Armamento cheio.")
        aviaoCombate1.addArma("Laser");

        // Creating JatoParticular instances
        JatoParticular jatoParticular1 = new JatoParticular(
                "JP1234", "Gulfstream G650", 2020, 31000, 30, 28, 8, 2, 13000, 1100, 14, 6_500_000, Categoria.HEAVY_JET, 70_000_000);
        JatoParticular jatoParticular2 = new JatoParticular(
                "JP5678", "Bombardier Global 7500", 2021, 32000, 31, 29, 8.2, 2, 14200, 1200, 19, 7_000_000, Categoria.LIGHT_JET, 75_000_000);

        // Adding installations to jatoParticular1
        jatoParticular1.addInstalcao("Wi-Fi");
        jatoParticular1.addInstalcao("Luxury seats");
        jatoParticular1.addInstalcao("Conference room");


        // Displaying details
        System.out.println("Details of AviaoCombate1:");
        aviaoCombate1.exibirDetalhes();
        System.out.println("\nDetails of AviaoCombate2:");
        aviaoCombate2.exibirDetalhes();

        System.out.println("\nDetails of JatoParticular1:");
        jatoParticular1.exibirDetalhes();
        System.out.println("\nDetails of JatoParticular2:");
        jatoParticular2.exibirDetalhes();
    }
}



