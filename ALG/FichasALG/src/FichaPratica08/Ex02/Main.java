package FichaPratica08.Ex02;

public class Main {
    public static void main(String[] args) {
        Cao c1 = new Cao("Daniel", "Humano");
        c1.setLatido("Boa tarde.");
        Cao c2 = new Cao("Bobby", "bobby");
        Cao c3 = new Cao("Scoob", "misterio");

        c1.latir();
        c2.latir();
        c3.latir();
    }
}
