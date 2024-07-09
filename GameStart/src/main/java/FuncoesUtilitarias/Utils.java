package FuncoesUtilitarias;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

    /**
     * Método que lê a quantidade de linhas de um ficheiro (entradas) excluindo o cabeçalho.
     *
     * @param path Caminho do ficheiro a ser lido.
     * @param hasCabecalho true se o ficheiro .csv têm cabeçalho.
     * @return A quantidade de linhas lidas, ou -1 se erro.
     */
    public static int lerLinhasFicheiro(String path, boolean hasCabecalho) {
        int qtdLinhas = 0;

        try {
            Scanner lerFicheiro = new Scanner(new File(path));

            if (hasCabecalho) {
                lerFicheiro.nextLine();
            }

            while (lerFicheiro.hasNextLine()) {
                lerFicheiro.nextLine();
                qtdLinhas++;
            }

            lerFicheiro.close();

            return qtdLinhas;
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException");
            System.err.println("ERRO NO METODO lerLinhasFicheiro.");
            System.err.println("PACKAGE: FuncoesUtilitarias");
            System.err.println("CLASS: Utils");
            System.err.println("FICHEIRO: " + path);
            System.err.println("QUANTIDADE DE LINHAS: " + qtdLinhas);
        }

        return -1;
    }


    /**
     * Método que imprime uma matriz do tipo String na consola.
     * @param matriz A matriz a ser imprimida.
     * @param tipoDados Tipo de dados a ser imprimido (vendas, clientes, etc...)
     *  De denotar o uso de "h" em vez de "j", devido á semelhança com o "i" 👍
     */
    public static void imprmirMatriz(String[][] matriz, String tipoDados) {
        for (int i = 0; i < matriz.length; i++) {
            for (int h = 0; h < matriz[0].length; h++) {
                if(h == 0){
                    System.out.println(tipoDados + ": " + matriz[i][h]);
                } else {
                    System.out.println("\t" + matriz[i][h]);
                }
            }
            System.out.println("-------------------------------");
        }
    }
}
