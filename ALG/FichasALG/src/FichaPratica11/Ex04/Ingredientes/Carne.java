package FichaPratica11.Ex04.Ingredientes;

public class Carne extends Topping{
    protected TipoCarne tipoCarne;

    public Carne(String codigo, String nome, Unidade unidadeMedida, int caloriasPorUnidade, double quantidade, OrigemIngrediente origem, TipoCarne tipoCarne) {
        super(codigo, nome, unidadeMedida, caloriasPorUnidade, quantidade, origem);
        this.tipoCarne = tipoCarne;
    }
}
