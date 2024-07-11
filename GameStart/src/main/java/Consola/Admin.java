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
        System.out.println("「 ✦ Bem vindo, " + username + " ✦ 」");
        System.out.println("\nEscolha uma opção:\n");
        System.out.println("a. Listagens (Vendas, Clientes, Categorias)");
        System.out.println("b. Total de Vendas");
        System.out.println("c. Total de Lucro");
        System.out.println("d. Pesquisa de Cliente");
        System.out.println("e. Clientes Compraram Jogo Mais Caro");
        System.out.println("f. Melhores Clientes");
        System.out.println("g. Categoria com Mais Lucro");
        System.out.println("h. Pesquisa Clientes Compraram Jogo");
        System.out.println("i. Top 5 Jogos (Lucro Gerado)");
        System.out.println("j. Bottom 5 Jogos (Lucro Gerado)");
        System.out.println("z. Sair");

        Scanner inTeclado = new Scanner(System.in);

        String opcao = inTeclado.nextLine();
        opcao = opcao.toLowerCase();

        do {
            switch (opcao) {
                case "a":
                    System.out.println("1. Vendas");
                    System.out.println("2. Clientes");
                    System.out.println("3. Categorias");
                    int escolhaListagem = inTeclado.nextInt();

                    if (escolhaListagem == 1) {
                        imprimirMatriz(vendas, "Venda: ");
                    } else if (escolhaListagem == 2) {
                        imprimirMatriz(clientes, "Cliente: ");
                    } else if (escolhaListagem == 3) {
                        imprimirMatriz(comissoes, "Comisssao: ");
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case "b":
                    System.out.println("\nVendas efetuadas: " + (vendas.length));
                    System.out.printf("Total vendido: %.2f €", totalVendas(vendas));
                    System.out.println();
                    break;
                case "c":
                    System.out.printf("Lucro total: %.2f €\n", lucro(vendas, comissoes));
                    System.out.println();
                    break;
                case "d":
                    System.out.println("Introduza o id a pesquisar.");
                    String clienteApesquisar = inTeclado.nextLine();
                    String[] clienteEncontrado = pesquisaCliente(clientes, clienteApesquisar);
                    if (clienteEncontrado == null) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        imprimirCliente(clienteEncontrado);
                    }
                    break;
                case "e":
                    String jogoMaisCaro = jogoMaisCaro(vendas);
                    String[] clientesJogoMaisCaro = clientesCompraramMaisCaro(vendas, jogoMaisCaro);

                    System.out.println("Clientes Compraram Jogo Mais Caro (" + jogoMaisCaro + "):\n");
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
                    for (int i = 0; i < maioresClientes.length; i++) {
                        imprimirJogosCompradoCliente(vendas, clientes, maioresClientes[i]);
                    }
                    break;
                case "g":
                    String[] maiorCategoriaEvalor = categoriasPorLucroGerado(vendas, comissoes);
                    System.out.println("\nCategoria maior lucro: " + maiorCategoriaEvalor[0]);
                    System.out.println("\nValor gerado: " + maiorCategoriaEvalor[1] + "€\n");
                    break;
                case "h":
                    System.out.println("Introduza o jogo a ser pesquisado:");
                    String jogoPesquisar = inTeclado.nextLine();
                    String[] clientesJogo = clientesCompraramJogo(vendas, jogoPesquisar);
                    System.out.println("\nClientes que compraram o jogo: " + jogoPesquisar);
                    for(int i = 0; i < clientesJogo.length; i++){
                        String[] cliente = pesquisaCliente(clientes, clientesJogo[i]);
                        imprimirCliente(cliente);
                    }
                    break;
                case "i":
                    String[][] top5 = getTop5Jogos(vendas,comissoes);
                    imprimirMatriz(top5, "JOGO: ");
                    break;
                case "j":
                    String[][] bottom5Jogos = getBottom5Jogos(vendas,comissoes);
                    imprimirMatriz(bottom5Jogos, "JOGO: ");
                    break;
                case "z":
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("「 ✦ Bem vindo, " + username + " ✦ 」");
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("a. Listagens (Vendas, Clientes, Categorias)");
            System.out.println("b. Total de Vendas");
            System.out.println("c. Total de Lucro");
            System.out.println("d. Pesquisa de Cliente");
            System.out.println("e. Jogo Mais Caro");
            System.out.println("f. Melhores Clientes");
            System.out.println("g. Categoria com Mais Lucro");
            System.out.println("h. Pesquisa Vendas de Jogo");
            System.out.println("i. Top 5 Jogos (Lucro Gerado)");
            System.out.println("j. Bottom 5 Jogos (Lucro Gerado)");
            System.out.println("z. Sair");

            opcao = inTeclado.nextLine();
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
