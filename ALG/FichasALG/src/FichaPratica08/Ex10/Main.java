package FichaPratica08.Ex10;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("tobias",1000,"Talho");
        f1.exibirDados();
        f1.aumentarSalario(0.5);
        f1.exibirDados();
    }
}
