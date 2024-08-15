package FichaPratica11.Ex04.Ingredientes;

public class Base extends Ingrediente {
    protected BasePizza tipoBase;
    protected String descricao;

    public Base(String codigo, String nome, Unidade unidadeMedida, int caloriasPorUnidade, double quantidade, BasePizza tipoBase, String descricao) {
        super(codigo, nome, unidadeMedida, caloriasPorUnidade, quantidade);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
