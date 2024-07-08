package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        try {
            File ficheiroLeitura = new File("Dados/ex07.txt");
            Scanner in = new Scanner(ficheiroLeitura);

            String linha = "";
            String[] conteudoLinha = linha.split(" ");
            int qtdPalavras = 0;
            int qtdLinhas = 0;

            while(in.hasNextLine()){
                linha = in.nextLine();
                conteudoLinha = linha.split(" ");
                if(conteudoLinha.length > 1 || (conteudoLinha.length == 1 && !conteudoLinha[0].isEmpty())){
                    qtdPalavras = qtdPalavras + conteudoLinha.length;
                }
                qtdLinhas++;
            }

            System.out.println("Quantidade de linhas: " + qtdLinhas);
            System.out.println("Quantidade de palavras: " + qtdPalavras);

            in.close();
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro nao encontrado.");
            throw new RuntimeException(e);
        }
    }
}
