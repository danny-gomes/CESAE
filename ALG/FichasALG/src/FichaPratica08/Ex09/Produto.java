package FichaPratica08.Ex09;

public class Produto {
    private String nome;
    private double preco;
    private int stock = 0;

    public Produto(String nome, double preco, int compra) {
        this.nome = nome;
        this.preco = preco;
        this.stock = compra;
    }

    public String vender(int qtdVender){
        if(this.stock < qtdVender){
            return "Nao ha stock.";
        }

        this.stock = this.stock - qtdVender;

        return "Vendido.";
    }

    public String comprar(int qtdComprar){
        this.stock = this.stock + qtdComprar;

        return "Comprado.";
    }
}
