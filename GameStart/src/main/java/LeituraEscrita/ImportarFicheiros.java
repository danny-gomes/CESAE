package Dados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FuncoesUtilitarias.Utils.lerLinhasFicheiro;

public class ImportarFicheiros {

    /**
     * Método que importa informações de um .csv para uma matriz de String.
     * @param path Caminho do ficheiro a ser importado.
     * @param colunas Colunas desse dado ficheiro.
     * @param hasCabecalho true se tiver cabeçalho.
     * @return A matriz com o conteúdo do ficheiro ou null se erro.
     */
    public static String[][] lerFicheiro(String path, int colunas, boolean hasCabecalho){
        int linhas = lerLinhasFicheiro(path, hasCabecalho);
        String[][] matriz = new String[linhas][colunas];

        try{
            Scanner lerFicheiro = new Scanner(new File(path));

            if(hasCabecalho) {
                lerFicheiro.nextLine();
            }

            String linha = "";
            String[] conteudoLinha = {};
            int countLinha = 0;

            while(lerFicheiro.hasNextLine()){
                linha = lerFicheiro.nextLine();
                conteudoLinha = linha.split(";");


                for(int i = 0; i < colunas; i++){
                    matriz[countLinha][i] = conteudoLinha[i];
                }

                countLinha++;
            }

            lerFicheiro.close();

            return matriz;

        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException");
            System.err.println("ERRO NO METODO lerFicheiro.");
            System.err.println("PACKAGE: LeituraEscrita");
            System.err.println("CLASS: ImportarFicheiros");
            System.err.println("FICHEIRO: " + path);
        }

        return null;
    }
}
