package FichaPratica09.Ex05;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Xavier", 33, "email", "919");
        Pessoa p2 = new Pessoa("Tobias", 22, "email2", "191");

        Agenda a1 = new Agenda();
        a1.addPessoa(p1);
        a1.listarAgenda();

        a1.addPessoa(p2);
        a1.listarAgenda();
    }
}
