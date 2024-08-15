package FichaPratica08.Ex09;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Meias", 29.99, 5);

        System.out.println(p1.vender(2));
        System.out.println(p1.comprar(10));
        System.out.println(p1.vender(35));
    }
}
