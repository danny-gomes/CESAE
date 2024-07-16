package FichaPratica08.Ex10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double aumento) {
        this.salario = this.salario + (this.salario * aumento);
    }

    public void exibirDados() {
        System.out.println("NOME: " + this.nome);
        System.out.println("SALARIO: " + this.salario);
        System.out.println("DEPARTAMENTO: " + this.departamento);
    }
}
