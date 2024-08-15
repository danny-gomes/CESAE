package FichaPratica09.Ex02;

public class Conta {
    private int numConta;
    private double saldo;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo;
    private double valorDivida;

    public Conta(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
        this.margemEmprestimo = 0.9 * this.saldo;
    }

    public void transferencia(double valor, int destinatario) {
        if(this.numConta == destinatario){
            this.saldo = this.saldo + valor;
            System.out.println("Transferencia feita.");
            this.margemEmprestimo = 0.9 * this.saldo;
        }
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        this.margemEmprestimo = 0.9 * this.saldo;
    }

    public double levantar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return 0;
        } else {
            this.saldo = this.saldo - valor;
            this.margemEmprestimo = 0.9 * this.saldo;
        }

        return valor;
    }

    public void mostrar() {
        System.out.println("SALDO DA CONTA: " + this.numConta + ": " + this.saldo);
    }

    public boolean pedirEmprestimo(double valor) {
        if(this.valorDivida > 0){
            System.out.println("Nao pode pedir emprestimo.");
            return false;
        } else if(this.margemEmprestimo < valor){
            this.valorDivida = valor;
            this.saldo = this.saldo + valor;
            this.margemEmprestimo = this.saldo * 0.9;
            return true;
        }

        return false;
    }
}
