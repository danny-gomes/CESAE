package FichaPratica09.Ex06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String pais;

    public Atleta(String nome, String modalidade, double altura, double peso, String pais) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }
}
