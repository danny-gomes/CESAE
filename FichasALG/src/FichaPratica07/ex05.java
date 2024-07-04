package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        try {
            File ficheiroLeitura = new File("Dados/ex05.txt");
            Scanner in = new Scanner(ficheiroLeitura);
            int soma = 0;

            while(in.hasNextInt()){
                soma = soma + in.nextInt();
            }

            in.close();

            System.out.println("Soma dos valores no ficheiro: " + soma);
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro nao encontrado.");
            throw new RuntimeException(e);
        }
    }
}
