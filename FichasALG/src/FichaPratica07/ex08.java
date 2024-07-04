package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        try {
            File ficheiroLeitura = new File("Dados/ex08.csv");
            Scanner in = new Scanner(ficheiroLeitura);
            String linha = in.nextLine();
            String[] conteudoLinha = linha.split(",");

            // 0 - tipo de produto,produto,quantidade vendida,valor unitario
            // 1 - produto
            // 2 - quantidade vendida
            // 3 - valor unitario

            int totalVendas = 0;

            while (in.hasNextLine()) {
                linha = in.nextLine();
                conteudoLinha = linha.split(",");

                totalVendas = totalVendas + Integer.parseInt(conteudoLinha[2]) * Integer.parseInt(conteudoLinha[3]);
            }

            System.out.println("Total de vendas: " + totalVendas);

            in.close();

        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro nao encontrado.");
            throw new RuntimeException(e);
        }
    }
}
