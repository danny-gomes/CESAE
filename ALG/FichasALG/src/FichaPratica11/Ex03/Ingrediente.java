package FichaPratica11.Ex03;

public class Ingrediente {
    protected String codigo;
    protected String nome;
    protected Unidade unidadeMedida;
    protected int caloriasPorUnidade;
    protected double quantidade;


    public Ingrediente(String codigo, String nome, Unidade unidadeMedida, int caloriasPorUnidade, double quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.caloriasPorUnidade = caloriasPorUnidade;
        this.quantidade = quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public Ingrediente(Unidade unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public int getCaloriasPorUnidade() {
        return caloriasPorUnidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("["+ this.codigo + " | " + this.nome + " | " + this.unidadeMedida + " | " + this.caloriasPorUnidade + "]: " + this.quantidade);
    }
}
