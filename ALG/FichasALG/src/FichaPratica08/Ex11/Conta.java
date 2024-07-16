package FichaPratica08.Ex11;

public class Conta {
    private int numConta;
    private double saldo;
    private String titular;

    public Conta(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void transferencia(double valor, int destinatario) {
        if(this.numConta == destinatario){
            this.saldo = this.saldo + valor;
            System.out.println("Transferencia feita.");
        }
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public double levantar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return 0;
        } else {
            this.saldo = this.saldo - valor;
        }

        return valor;
    }

    public void mostrar() {
        System.out.println("SALDO DA CONTA: " + this.numConta + ": " + this.saldo);
    }
}
