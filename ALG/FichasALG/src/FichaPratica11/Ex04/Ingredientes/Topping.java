package FichaPratica11.Ex04.Ingredientes;

public class Topping extends Ingrediente{

    protected OrigemIngrediente origem;

    public Topping() {
    }

    public Topping(String codigo, String nome, Unidade unidadeMedida, int caloriasPorUnidade, double quantidade, OrigemIngrediente origem) {
        super(codigo, nome, unidadeMedida, caloriasPorUnidade, quantidade);
        this.origem = origem;
    }
}
