package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        try {
            File ficheiroLeitura = new File("Dados/ex03_leitura.txt");
            File ficheiroEscrita = new File ("Dados/ex03_escrita.txt");
            Scanner in = new Scanner(ficheiroLeitura);
            PrintWriter pw = new PrintWriter(ficheiroEscrita);
            String linha;

            while(in.hasNextLine()){
                linha = in.nextLine();
                pw.println(linha);
            }

            in.close();
            pw.close();

            System.out.println("Leitura e escrita feita com sucesso.");

        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro nao encontrado.");
            throw new RuntimeException(e);
        }
    }
}
