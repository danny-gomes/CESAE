package Consola;

import java.util.Scanner;

import static FuncoesUtilitarias.Utils.*;
import static FuncoesUtilitarias.UtilsAdmin.*;

public class Admin {

    /**
     * Procedimento que apresenta o menu de admin e reencaminha a opção
     * de admin para o método que tratará a escolha.
     *
     * @param username  username do admin que fez login.
     * @param vendas
     * @param clientes
     * @param comissoes
     */
    public static void menuAdmin(String username, String[][] vendas, String[][] clientes, String[][] comissoes) {
        System.out.println("\n\uD83D\uDC7E\uD83D\uDD27\uD83D\uDC7E「 ✦ Bem vindo, " + username + " ✦ 」\uD83D\uDC7E\uD83D\uDD27\uD83D\uDC7E");
        System.out.println("\n\uD83E\uDD14 Escolha uma opção:\n");
        System.out.println("a. \uD83D\uDCDD Listagens (Vendas, Clientes, Categorias)");
        System.out.println("b. \uD83D\uDED2 Total de Vendas");
        System.out.println("c. \uD83D\uDCB0 Total de Lucro");
        System.out.println("d. \uD83D\uDC64 Pesquisa de Cliente");
        System.out.println("e. \uD83E\uDD11 Clientes que Compraram Jogo Mais Caro");
        System.out.println("f. \uD83C\uDFC6 Melhores Clientes");
        System.out.println("g. \uD83D\uDCC8 Categoria com Mais Lucro");
        System.out.println("h. \uD83D\uDD0E Pesquisa Clientes Compraram Jogo");
        System.out.println("i. \uD83E\uDD47 Top 5 Jogos (Lucro Gerado)");
        System.out.println("j. \uD83D\uDCC9 Bottom 5 Jogos (Lucro Gerado)");
        System.out.println("z. ❌ Sair");

        Scanner inTeclado = new Scanner(System.in);

        String opcao = inTeclado.next();
        inTeclado.nextLine();
        opcao = opcao.toLowerCase();

        do {
            switch (opcao) {
                case "a":
                    System.out.println("\n1. \uD83C\uDFF7\uFE0F Vendas ");
                    System.out.println("2. \uD83D\uDE4D\u200D Clientes");
                    System.out.println("3. \uD83D\uDC7E Categorias");
                    int escolhaListagem = inTeclado.nextInt();
                    inTeclado.nextLine();

                    if (escolhaListagem == 1) {
                        imprimirMatriz(vendas, "VENDAS");
                    } else if (escolhaListagem == 2) {
                        imprimirMatriz(clientes, "CLIENTES");
                    } else if (escolhaListagem == 3) {
                        imprimirMatriz(comissoes, "CATEGORIAS");
                    } else {
                        System.out.println("❌ Opção inválida. ❌");
                    }
                    break;
                case "b":
                    System.out.println("\n\uD83E\uDD1D Vendas efetuadas: " + (vendas.length));
                    System.out.printf("\uD83D\uDCB0 Total vendido: %.2f €", totalVendas(vendas));
                    System.out.println("\n");
                    break;
                case "c":
                    System.out.printf("\n\uD83E\uDD11 Lucro total: %.2f €\n", lucro(vendas, comissoes));
                    System.out.println();
                    break;
                case "d":
                    System.out.println("\n\uD83D\uDD0E Introduza o id a pesquisar.");
                    String clienteApesquisar = inTeclado.next();
                    inTeclado.nextLine();
                    String[] clienteEncontrado = pesquisaCliente(clientes, clienteApesquisar);
                    if (clienteEncontrado == null) {
                        System.out.println("\n❌ Cliente não encontrado. ❌");
                    } else {
                        imprimirCliente(clienteEncontrado);
                    }
                    break;
                case "e":
                    String jogoMaisCaro = jogoMaisCaro(vendas);
                    String[] clientesJogoMaisCaro = clientesCompraramMaisCaro(vendas, jogoMaisCaro);

                    System.out.println("\n\uD83D\uDCB8 Clientes que Compraram Jogo Mais Caro (" + jogoMaisCaro + "):\n");
                    for (int i = 0; i < clientesJogoMaisCaro.length; i++) {
                        String[] clienteMaisCaro = pesquisaCliente(clientes, clientesJogoMaisCaro[i]);
                        imprimirCliente(clienteMaisCaro);
                    }
                    break;
                case "f":
                    // NOTA: Este aqui compliquei um bocado porque no enunciado diz "qual/quais" entao fiz para um
                    // cenario que ha empate de valor total gasto por dois clientes para testar adicionar:
                    // V00-176;91;Frontier Developments;Simulador;Jogo Muito Caro;600.64
                    // 91;Daniel Gomes;910000097;costuras.gomes@gmail.com
                    double[][] comprasClientes = totalGastoPorCliente(vendas);
                    String[] maioresClientes = melhorClientes(comprasClientes);
                    if(maioresClientes.length > 1){
                        System.out.println("\n\uD83C\uDFC6 Melhores clientes: ");

                    } else {
                        System.out.println("\n\uD83C\uDFC6 Melhor cliente: ");
                    }

                    for (int i = 0; i < maioresClientes.length; i++) {
                        imprimirCliente(pesquisaCliente(clientes, maioresClientes[i]));
                        imprimirJogosCompradoCliente(vendas, clientes, maioresClientes[i]);
                    }

                    break;
                case "g":
                    String[] maiorCategoriaEvalor = categoriasPorLucroGerado(vendas, comissoes);
                    System.out.println("\n\uD83D\uDC7E Categoria maior lucro: " + maiorCategoriaEvalor[0]);
                    System.out.println("\n\uD83E\uDD11 Valor gerado: " + maiorCategoriaEvalor[1] + "€\n");
                    break;
                case "h":
                    System.out.println("\uD83C\uDFAE Introduza o jogo a ser pesquisado:");
                    String jogoPesquisar = inTeclado.nextLine();
                    String[] clientesJogo = clientesCompraramJogo(vendas, jogoPesquisar);
                    if (clientesJogo.length == 0) {
                        System.out.println("\n❌  Nenhum cliente compro o jogo: " + jogoPesquisar + " ❌");
                    } else {
                        System.out.println("\n\uD83D\uDC65 Clientes que compraram o jogo: " + jogoPesquisar);
                        for (int i = 0; i < clientesJogo.length; i++) {
                            String[] cliente = pesquisaCliente(clientes, clientesJogo[i]);
                            imprimirCliente(cliente);
                        }
                    }
                    break;
                case "i":
                    String[][] top5 = getTop5Jogos(vendas, comissoes);
                    System.out.println();
                    imprimirMatriz(top5, "JOGOS");
                    break;
                case "j":
                    String[][] bottom5Jogos = getBottom5Jogos(vendas, comissoes);
                    System.out.println();
                    imprimirMatriz(bottom5Jogos, "JOGOS");
                    break;
                case "z":
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (!opcao.equals("z")) {
                System.out.println("\n\uD83D\uDC7E\uD83D\uDD27\uD83D\uDC7E「 ✦ Bem vindo, " + username + " ✦ 」\uD83D\uDC7E\uD83D\uDD27\uD83D\uDC7E");
                System.out.println("\n\uD83E\uDD14 Escolha uma opção:\n");
                System.out.println("a. \uD83D\uDCDD Listagens (Vendas, Clientes, Categorias)");
                System.out.println("b. \uD83D\uDED2 Total de Vendas");
                System.out.println("c. \uD83D\uDCB0 Total de Lucro");
                System.out.println("d. \uD83D\uDC64 Pesquisa de Cliente");
                System.out.println("e. \uD83E\uDD11 Clientes que Compraram Jogo Mais Caro");
                System.out.println("f. \uD83C\uDFC6 Melhores Clientes");
                System.out.println("g. \uD83D\uDCC8 Categoria com Mais Lucro");
                System.out.println("h. \uD83D\uDD0E Pesquisa Clientes Compraram Jogo");
                System.out.println("i. \uD83E\uDD47 Top 5 Jogos (Lucro Gerado)");
                System.out.println("j. \uD83D\uDCC9 Bottom 5 Jogos (Lucro Gerado)");
                System.out.println("z. ❌ Sair");

                opcao = inTeclado.next();
                inTeclado.nextLine();
            }


        } while (!opcao.equals("z"));

    }

    /**
     * Método que valida login de Admin.
     *
     * @param login    Matriz com os dados de login dos admin.
     * @param username User introduzido pelo utilizador para login
     * @param password Password introduzida pelo utilizador para login.
     * @return true se login válido.
     */
    public static boolean loginAdmin(String[][] login, String username, String password) {
        for (int i = 0; i < login.length; i++) {
            if (login[i][0].equals(username) && login[i][1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
