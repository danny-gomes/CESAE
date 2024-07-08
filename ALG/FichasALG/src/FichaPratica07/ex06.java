package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        try {
            File ficheiroLeitura = new File("Dados/ex06.csv");
            Scanner in = new Scanner(ficheiroLeitura);
            String linha = in.nextLine();
            String[] conteudoLinha = linha.split(",");

            // 0 - nome
            // 1 - idade (string)

            int maior = 0;
            String maisVelho = "";

            while(in.hasNextLine()){
                linha = in.nextLine();
                conteudoLinha = linha.split(",");

                if(Integer.valueOf(conteudoLinha[1]) > maior){
                    maior = Integer.valueOf(conteudoLinha[1]);
                    maisVelho = conteudoLinha[0];
                }
            }

            System.out.println("Mais velho: " + maisVelho);

            in.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro nao encontrado.");
            throw new RuntimeException(e);
        }
    }
}
