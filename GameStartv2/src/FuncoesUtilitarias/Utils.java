package FuncoesUtilitarias;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

    /**
     * Método que lê a quantidade de linhas de um ficheiro (entradas) excluindo o cabeçalho.
     *
     * @param path         Caminho do ficheiro a ser lido.
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
     *
     * @param matriz    A matriz a ser imprimida.
     * @param tipoDados Tipo de dados a ser imprimido (vendas, clientes, etc...)
     *                  De denotar o uso de "h" em vez de "j", devido á semelhança com o "i" 👍
     */
    public static void imprimirMatriz(String[][] matriz, String tipoDados) {
        for (int i = 0; i < matriz.length; i++) {
            if (tipoDados.equalsIgnoreCase("VENDAS")) {
                System.out.println("\uD83C\uDFF7\uFE0F Venda:" + matriz[i][0]);
                System.out.println("\t\uD83C\uDD94 ID Cliente: " + matriz[i][1]);
                System.out.println("\t\uD83D\uDD8B\uFE0F Editora: " + matriz[i][2]);
                System.out.println("\t\uD83D\uDC7E Categoria: " + matriz[i][3]);
                System.out.println("\t\uD83C\uDFAE Jogo: " + matriz[i][4]);
                System.out.println("\t\uD83D\uDCB2 Valor: " + matriz[i][5] + "€");
                System.out.println("--------------------------");
            } else if (tipoDados.equalsIgnoreCase("CLIENTES")) {
                System.out.println("\uD83C\uDD94 ID Cliente:" + matriz[i][0]);
                System.out.println("\t\uD83D\uDE4D\u200D♂\uFE0F Nome: " + matriz[i][1]);
                System.out.println("\t\uD83D\uDCDE Telemóvel: " + matriz[i][2]);
                System.out.println("\t\uD83D\uDCE7 Email: " + matriz[i][3]);
                System.out.println("--------------------------");
            } else if (tipoDados.equalsIgnoreCase("CATEGORIAS")) {
                System.out.println("\uD83D\uDC7E Categoria: " + matriz[i][0]);
                System.out.println("\uD83C\uDFF7\uFE0F Comissão: " + matriz[i][1] + "%");
                System.out.println("--------------------------");

            } else if (tipoDados.equalsIgnoreCase("JOGOS")) {
                System.out.println("\uD83C\uDFAE Jogo: " + matriz[i][0]);
                System.out.println("\uD83E\uDD11 Lucro: " + matriz[i][1] + "€");
                System.out.println("--------------------------");
            } else {
                System.out.println("❌ Tipo Dados Inválido. ❌");
            }
        }
    }

    /**
     * Método que imprime um cliente
     *
     * @param cliente o cliente a ser imprimido
     */
    public static void imprimirCliente(String[] cliente) {
        System.out.println("\n\uD83C\uDD94 ID:" + cliente[0]);
        System.out.println("\t\uD83D\uDE4D\u200D♂\uFE0F Nome:" + cliente[1]);
        System.out.println("\t\uD83D\uDCDE Telemóvel:" + cliente[2]);
        System.out.println("\t\uD83D\uDCE7 Email:" + cliente[3] + "\n");
        System.out.println("-----------------------------");
    }


    /**
     * Método que imprime os jogos comprados por um certo cliente recebido por parâmetro.
     *
     * @param vendas    matriz das vendad.
     * @param clientes  matriz com os clientes.
     * @param idCliente cliente a ter os jogos impressos.
     */
    public static void imprimirJogosCompradoCliente(String[][] vendas, String[][] clientes, String idCliente) {
        System.out.println("\n\uD83C\uDFC6 Compras " + getNomeClientePorID(clientes, idCliente) + ":\n");
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i][1].equalsIgnoreCase(idCliente)) {
                System.out.println("\uD83C\uDFAE " + vendas[i][4]);
            }
        }
        System.out.println();
    }

    /**
     * Método que devolte o nome de um cliente pelo seu ID.
     *
     * @param clientes  a matriz dos clientes.
     * @param idCliente o id de cliente a pesquisar.
     * @return o cliente encontrado ou null se não encontrado.
     */
    private static String getNomeClientePorID(String[][] clientes, String idCliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i][0].equalsIgnoreCase(idCliente)) {
                return clientes[i][1];
            }
        }

        return null;
    }

    /**
     * Método que retorna um array com os lugares vagos.
     *
     * @param lugaresVagos array com os lugares vagos.
     */
    public static void imprimirLugarsVagos(int[] lugaresVagos) {
        System.out.println("LUGARES DISPONIVEIS: ");
        for (int i = 0; i < lugaresVagos.length; i++) {
            System.out.println("\uD83C\uDD7F\uFE0F LUGAR " + lugaresVagos[i]);
        }
    }

    public static void imprimirCatalogo(String[] catalogo) {
        System.out.println(" \uD83C\uDFAE \uD83C\uDFAE Os Nossos Jogos: \uD83C\uDFAE \uD83C\uDFAE ");
        for (int i = 0; i < catalogo.length; i++) {
            System.out.println((i + 1) + "." + catalogo[i]);
            System.out.println("-------------------");
        }
    }

    /**
     * Método que imprime o array de jogos por editora (numa linha a primeira coluna e a categoria
     * e as restantes os respetivos jogos.
     * @param jogosEditora a matriz com os jogos por categoria de uma editora.
     */
    public static void imprimirJogosPorEditora(String[][] jogosEditora, String titulo) {
        for (int i = 0; i < jogosEditora.length; i++) {
            System.out.println(titulo + " " + jogosEditora[i][0] + "\n");
            for (int h = 1; h < jogosEditora[i].length && jogosEditora[i][h] != null; h++) {
                System.out.println("\uD83C\uDFAE " + jogosEditora[i][h]);
            }
            System.out.println("---------------------------");
        }
    }

}
