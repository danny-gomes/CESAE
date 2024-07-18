package FichaPratica09.Ex06;

public class Main {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("tobias", "natacao", 1.77,88,"Seucia");
        Atleta a2 = new Atleta("xavier", "futebol", 1.76,48,"Portugal");
        Atleta a3 = new Atleta("iglesias", "basket", 1.47,75,"Espanha");
        Atleta a4 = new Atleta("saul", "baseball", 1.67,85,"Suica");
        Atleta a5 = new Atleta("enrique", "dardos", 1.97,102,"Englatera");
        Atleta a6 = new Atleta("raul", "bilhar", 1.22,55,"Franca");

        Competicao c1 = new Competicao("Comp1","espanha");
        Competicao c2 = new Competicao("Comp2", "madeira");

        c1.addAtleta(a1);
        c1.addAtleta(a2);
        c1.addAtleta(a3);

        c2.addAtleta(a1);
        c2.addAtleta(a4);
        c2.addAtleta(a5);
        c2.addAtleta(a6);

        c1.exibirDetalhes();
        c2.exibirDetalhes();
    }
}
