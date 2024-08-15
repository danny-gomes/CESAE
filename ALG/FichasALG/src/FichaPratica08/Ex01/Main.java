package FichaPratica08.Ex01;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel", 29, 1.22);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());
    }
}
