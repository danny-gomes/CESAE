package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        try {
            File ficheiroLeitura = new File("Dados/ex04.csv");
            Scanner in = new Scanner(ficheiroLeitura);

            String linha = in.nextLine();

            // 0 - nome
            // 1 - data nascimento
            // 2 - data falecimento
            // 3 - quote

            while(in.hasNextLine()){
                linha = in.nextLine();
                String[] conteudoLinha = linha.split(",");

                System.out.println(conteudoLinha[0]);
                System.out.print("\t" + conteudoLinha[1]);
                System.out.print(" - " + conteudoLinha[2] + "\n");
                System.out.println("\t" + conteudoLinha[3]);
            }

            System.out.println("Ficheiro lido com sucesso.");
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro nao encontrado.");
            throw new RuntimeException(e);
        }
    }
}
