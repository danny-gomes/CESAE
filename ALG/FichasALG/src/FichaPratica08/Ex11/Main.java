package FichaPratica08.Ex11;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, 0,"tobias");
        c1.depositar(1000);
        c1.mostrar();
        c1.levantar(120);
        c1.mostrar();

        Conta c2 = new Conta(2, 1000, "xavier");
        c1.transferencia(c2.levantar(100), 1);
        c1.mostrar();
        c2.mostrar();
    }
}
