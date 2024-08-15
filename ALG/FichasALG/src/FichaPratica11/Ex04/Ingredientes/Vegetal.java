package FichaPratica11.Ex04.Ingredientes;

public class Vegetal extends Topping{
    protected TipoVegetal tipoVegetal;

    public Vegetal(String codigo, String nome, Unidade unidadeMedida, int caloriasPorUnidade, double quantidade, OrigemIngrediente origem, TipoVegetal tipoVegetal) {
        super(codigo, nome, unidadeMedida, caloriasPorUnidade, quantidade, origem);
        this.tipoVegetal = tipoVegetal;
    }
}
