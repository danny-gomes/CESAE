package FichaPratica10.Ex03;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of BarcoPesca
        BarcoPesca barcoPesca = new BarcoPesca("Pesqueiro Feliz", "Azul", "2015", 5, 500.0, Marca.QUICKSILVER);

        // Creating instances of Peixe
        Peixe peixe1 = new Peixe("Salmon", 20.0, 15.0);
        Peixe peixe2 = new Peixe("Tuna", 30.0, 20.0);
        Peixe peixe3 = new Peixe("Cod", 25.0, 10.0);
        Peixe peixe4 = new Peixe("Haddock", 22.0, 12.0);
        Peixe peixe5 = new Peixe("Trout", 18.0, 18.0);

        // Creating instances of Marisco
        Marisco marisco1 = new Marisco("Lobster", 10.0, 30.0);
        Marisco marisco2 = new Marisco("Shrimp", 5.0, 25.0);
        Marisco marisco3 = new Marisco("Crab", 12.0, 20.0);
        Marisco marisco4 = new Marisco("Scallop", 8.0, 28.0);
        Marisco marisco5 = new Marisco("Oyster", 6.0, 22.0);

        // Adding Peixe instances to BarcoPesca
        barcoPesca.pescarPeixe(peixe1);
        barcoPesca.pescarPeixe(peixe2);
        barcoPesca.pescarPeixe(peixe3);
        barcoPesca.pescarPeixe(peixe4);
        barcoPesca.pescarPeixe(peixe5);

        // Adding Marisco instances to BarcoPesca
        barcoPesca.pescarMarisco(marisco1);
        barcoPesca.pescarMarisco(marisco2);
        barcoPesca.pescarMarisco(marisco3);
        barcoPesca.pescarMarisco(marisco4);
        barcoPesca.pescarMarisco(marisco5);

        // Printing total value of the catch
        System.out.println("Valor total da pesca: " + barcoPesca.calcularTotal());

        // Printing salary per crew member
        System.out.println("Salario por tripulante: " + barcoPesca.salarioTripulacao());
    }
}

