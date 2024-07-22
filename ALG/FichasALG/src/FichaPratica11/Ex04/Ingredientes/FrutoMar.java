package FichaPratica11.Ex04.Ingredientes;

public class FrutoMar extends Topping{
    protected TipoFrutoMar tipoFrutoMar;

    public FrutoMar(String codigo, String nome, Unidade unidadeMedida, int caloriasPorUnidade, double quantidade, OrigemIngrediente origem, TipoFrutoMar tipoFrutoMar) {
        super(codigo, nome, unidadeMedida, caloriasPorUnidade, quantidade, origem);
        this.tipoFrutoMar = tipoFrutoMar;
    }

}
