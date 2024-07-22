package FichaPratica11.Ex04.Ingredientes;

public class Queijo extends Topping{
    protected TipoQueijo tipoQueijo;

    public Queijo(String codigo, String nome, Unidade unidadeMedida, int caloriasPorUnidade, double quantidade, OrigemIngrediente origem, TipoQueijo tipoQueijo) {
        super(codigo, nome, unidadeMedida, caloriasPorUnidade, quantidade, origem);
        this.tipoQueijo = tipoQueijo;
    }


}
