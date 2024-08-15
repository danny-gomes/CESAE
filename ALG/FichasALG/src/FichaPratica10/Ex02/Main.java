package FichaPratica10.Ex02;

public class Main {
    public static void main(String[] args) {
        Sorteio s1 = new Sorteio(55);

        Pessoa p1 = new Pessoa("Alice", 30, "123-456-7890", "alice@example.com");
        s1.addPessoa(p1);

        Pessoa p2 = new Pessoa("Bob", 45, "234-567-8901", "bob@example.com");
        s1.addPessoa(p2);

        Pessoa p3 = new Pessoa("Charlie", 17, "345-678-9012", "charlie@example.com");  // Under 18
        s1.addPessoa(p3);

        Pessoa p4 = new Pessoa("Diana", 25, "456-789-0123", "diana@example.com");
        s1.addPessoa(p4);

        Pessoa p5 = new Pessoa("Edward", 55, "567-890-1234", "edward@example.com");
        s1.addPessoa(p5);

        s1.imprimirListaParticipantes();

        Pessoa vencedora = s1.sortear();
        System.out.println("\n***** VENCEDOR *****\n");
        vencedora.exibirDetalhes();
    }
}
