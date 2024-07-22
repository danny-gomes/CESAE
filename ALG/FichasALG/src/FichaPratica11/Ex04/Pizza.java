package FichaPratica11.Ex04;

import FichaPratica11.Ex04.Ingredientes.Ingrediente;
import FichaPratica11.Ex04.Ingredientes.Tamanho;

import java.util.ArrayList;

public class Pizza {
    protected String codigo;
    protected String nome;
    protected String descricao;
    protected double preco;
    protected Tamanho tamanho;
    protected ArrayList<Ingrediente> ingredientes;

    public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente i) {
        if (this.ingredientes.size() == 5) {
            System.out.println("Demasiados ingredientes.");
            return;
        }

        this.ingredientes.add(i);
        System.out.println("Ingrediente adicionado.");
    }

    public void editarQuantidadeIngrediente(Ingrediente i, double novaQuantidade) {
        int indiceIngrediente = this.ingredientes.indexOf(i);

        if (indiceIngrediente == -1) {
            System.out.println("Ingrediente nao encontrado.");
            return;
        }

        this.ingredientes.get(indiceIngrediente).setQuantidade(novaQuantidade);
    }

    public void removerIngrediente(Ingrediente ingApesquisar) {
        for (Ingrediente i : this.ingredientes) {
            if (i.getCodigo().equalsIgnoreCase(ingApesquisar.getCodigo())) {
                this.ingredientes.remove(i);
                System.out.println("Ingrediente removido.");
                return;
            }
        }

        System.out.println("Ingrediente nao encontrado.");
    }

    public double calorias() {
        double calorias = 0;

        for (Ingrediente i : this.ingredientes) {
            calorias = calorias + i.getQuantidade() * i.getCaloriasPorUnidade();
        }

        return calorias;
    }

    public void exibirDetalhes(){
        System.out.println("**** " + this.nome + " *****");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Preco: " + this.preco);
        System.out.println("Tamanho: " + this.tamanho);
        for(int i = 0; i < this.ingredientes.size(); i++){
            System.out.print("Ingrediente " + (i+1));
            this.ingredientes.get(i).exibirDetalhes();
        }
    }
}
