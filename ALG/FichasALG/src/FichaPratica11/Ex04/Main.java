package FichaPratica11.Ex04;

import FichaPratica11.Ex04.Ingredientes.Ingrediente;
import FichaPratica11.Ex04.Ingredientes.Tamanho;
import FichaPratica11.Ex04.Ingredientes.Unidade;

public class Main {
    public static void main(String[] args) {
        // Create ingredient instances
        Ingrediente ingrediente1 = new Ingrediente("I001", "Tomate", Unidade.GRAMAS, 18, 100);
        Ingrediente ingrediente2 = new Ingrediente("I002", "Queijo", Unidade.GRAMAS, 402, 200);
        Ingrediente ingrediente3 = new Ingrediente("I003", "Pepperoni", Unidade.GRAMAS, 494, 50);
        Ingrediente ingrediente4 = new Ingrediente("I004", "Cogumelos", Unidade.GRAMAS, 22, 70);
        Ingrediente ingrediente5 = new Ingrediente("I005", "Azeitonas", Unidade.GRAMAS, 115, 30);
        Ingrediente ingrediente6 = new Ingrediente("I006", "Manjericão", Unidade.GRAMAS, 23, 5);

        // Create a pizza instance
        Pizza pizza = new Pizza("P001", "Pizza Especial", "Pizza com ingredientes especiais", 12.99, Tamanho.GRANDE);

        // Add ingredients to the pizza
        pizza.adicionarIngrediente(ingrediente1);
        pizza.adicionarIngrediente(ingrediente2);
        pizza.adicionarIngrediente(ingrediente3);
        pizza.adicionarIngrediente(ingrediente4);
        pizza.adicionarIngrediente(ingrediente5);

        // Try adding a sixth ingredient (should print "Demasiados ingredientes.")
        pizza.adicionarIngrediente(ingrediente6);

        // Edit the quantity of an ingredient
        pizza.editarQuantidadeIngrediente(ingrediente3, 100); // Change Pepperoni quantity to 100 grams

        // Remove an ingredient
        pizza.removerIngrediente(ingrediente4); // Remove Cogumelos

        // Calculate and display the total calories
        double totalCalorias = pizza.calorias();
        System.out.println("Total de calorias: " + totalCalorias);

        // Display the details of the pizza
        pizza.exibirDetalhes();
    }
}
