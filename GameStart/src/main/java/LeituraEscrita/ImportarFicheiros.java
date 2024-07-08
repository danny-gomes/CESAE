package Dados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FuncoesUtilitarias.Utils.lerLinhasFicheiro;

public class ImportarFicheiros {

    public static String[][] lerVendas(String path){
        int linhas = lerLinhasFicheiro(path, true);
        int colunas = 6;
        String[][] matrizVendas = new String[linhas][colunas];

        try{
            Scanner lerVendas = new Scanner(new File(path));

            String linha = lerVendas.nextLine();
            String[] conteudoLinha = linha.split(",");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
