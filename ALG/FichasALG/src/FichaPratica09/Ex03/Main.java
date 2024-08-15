package FichaPratica09.Ex03;

public class Main {
    public static void main(String[] args) {
        String[] alimentos = {"Mac", "KFC", "BK"};

        Animal a1 = new Animal("Xavier","Humano","Portugal",288,alimentos);
        a1.exibirDetalhes();
        a1.comer("TACO BELL", 2000);
        a1.exibirDetalhes();
        a1.comer("KFC", 2000);
        a1.exibirDetalhes();
    }
}
