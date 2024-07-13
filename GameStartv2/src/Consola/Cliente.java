package Consola;

import java.util.Scanner;

import static LeituraEscrita.ImportarFicheiros.imprimirFicheiro;
import static FuncoesUtilitarias.Utils.*;
import static FuncoesUtilitarias.UtilsCliente.*;

public class Cliente {
    public static void menuCliente(String[][] vendas, String[][] clientes, String[][] comissoes) {
        System.out.println("\n\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E「 ✦ Bem-vindo á GameStart! ✦ 」\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E\n");
        System.out.println("\uD83E\uDD14 Escolha uma opção:");
        System.out.println("a. ✍\uFE0F Novo Registo");
        System.out.println("b. \uD83C\uDD7F\uFE0F Procurar Estacionamento");
        System.out.println("c. \uD83D\uDCCB Imprimir Catálogo");
        System.out.println("d. \uD83D\uDDBC\uFE0F Imprimir Catálogo Gráfico");
        System.out.println("e. \uD83C\uDFE2 Imprimir Catálogo Editora");
        System.out.println("f. \uD83D\uDC7E Imprimir Catálogo Categoria");
        System.out.println("g. \uD83C\uDD95 Imprimir Jogo Mais Recente");
        System.out.println("z. ❌ Sair");

        Scanner inTeclado = new Scanner(System.in);
        String opcao = inTeclado.next();
        inTeclado.nextLine();
        opcao = opcao.toLowerCase();
        int countClientes = clientes.length;
        do {
            switch (opcao) {
                case "a":
                    System.out.println(" ✎ Introduza o nome:");
                    String nome = inTeclado.nextLine();
                    System.out.println(" \uD83D\uDCE7 Introduza o email:");
                    String email = inTeclado.next();
                    inTeclado.nextLine();
                    System.out.println(" \uD83D\uDCDE Introduza o contacto.");
                    String contacto = inTeclado.next();
                    inTeclado.nextLine();
                    countClientes++;
                    String[] novoCliente = simulaRegistoCliente(Double.toString(countClientes), nome, contacto, email);
                    System.out.println("\n✅ CLIENTE REGISTADO COM SUCESSO ✅");
                    imprimirCliente(novoCliente);
                    break;
                case "b":
                    int[] lugaresVagos = lugaresVagos();
                    System.out.println();
                    imprimirLugarsVagos(lugaresVagos);
                    break;
                case "c":
                    String[] catalogo = getCatalogo(vendas);
                    System.out.println();
                    imprimirCatalogo(catalogo);
                    break;
                case "d":
                    System.out.println(" \uD83D\uDCDA Escolha o catálogo a imprimir.");
                    int opcaoCat = 0;
                    do {
                        System.out.println("1 - Call of Duty \uD83D\uDD2B");
                        System.out.println("2 - Hollow Knight \uD83D\uDC80");
                        System.out.println("3 - Fifa ⚽");
                        System.out.println("4 - Mortal Kombat \uD83E\uDD4B");
                        System.out.println("5 - Overcooked \uD83E\uDD58");
                        System.out.println("6 - Witcher 3: Wild Hunt \uD83D\uDD2E");
                        System.out.println("7 - Minecraft \uD83D\uDC8E");
                        opcaoCat = inTeclado.nextInt();
                        inTeclado.nextLine();
                    } while (opcaoCat < 1 || opcaoCat > 8);

                    switch (opcaoCat) {
                        case 1:
                            imprimirFicheiro("Dados/CatalogoGrafico/callOfDuty.txt");
                            break;
                        case 2:
                            imprimirFicheiro("Dados/CatalogoGrafico/hollowKnight.txt");
                            break;
                        case 3:
                            imprimirFicheiro("Dados/CatalogoGrafico/fifa.txt");
                            break;
                        case 4:
                            imprimirFicheiro("Dados/CatalogoGrafico/mortalKombat.txt");
                            break;
                        case 5:
                            imprimirFicheiro("Dados/CatalogoGrafico/overcooked.txt");
                            break;
                        case 6:
                            imprimirFicheiro("Dados/CatalogoGrafico/witcher3.txt");
                            break;
                        case 7:
                            imprimirFicheiro("Dados/CatalogoGrafico/minecraft.txt");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case "e":
                    System.out.println("\uD83D\uDD8B\uFE0F Introduza a editora a pesquisar.");
                    String editora = inTeclado.nextLine();
                    System.out.println();
                    String[][] jogosPorCategoriaEditora = jogosEditora(vendas, editora);
                    if (jogosPorCategoriaEditora == null) {
                        System.out.println("❌ Editora não encontrada. ❌");
                    } else {
                        imprimirJogosPorEditoraOuCategoria(jogosPorCategoriaEditora, "\uD83D\uDC7E CATEGORIA:");
                    }
                    break;
                case "f":
                    System.out.println("\uD83D\uDC7E Introduza a categoria a pesquisar.");
                    String categoria = inTeclado.nextLine();
                    String[][] jogosPorEditoraCategoria = jogosCategoria(vendas, categoria);
                    System.out.println();
                    if (jogosPorEditoraCategoria == null) {
                        System.out.println("❌ Categoria não encontrada. ❌");
                    } else {
                        imprimirJogosPorEditoraOuCategoria(jogosPorEditoraCategoria, "\uD83D\uDD8B\uFE0F EDITORA:");
                    }
                    break;
                case "g":
                    System.out.println("\n\uD83C\uDD95\uD83C\uDD95 Jogo Mais Recente: " + getJogoMaisRecente(vendas) + " \uD83C\uDD95\uD83C\uDD95");
                    break;
                case "z":
                    break;
                default:
                    System.out.println("❌ Opção inválida. ❌");
            }

            if (!opcao.equals("z")) {
                System.out.println("\n\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E「 ✦ Bem-vindo á GameStart! ✦ 」\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E\n");
                System.out.println("\uD83E\uDD14 Escolha uma opção:");
                System.out.println("a. ✍\uFE0F Novo Registo");
                System.out.println("b. \uD83C\uDD7F\uFE0F Procurar Estacionamento");
                System.out.println("c. \uD83D\uDCCB Imprimir Catálogo");
                System.out.println("d. \uD83D\uDDBC\uFE0F Imprimir Catálogo Gráfico");
                System.out.println("e. \uD83C\uDFE2 Imprimir Catálogo Editora");
                System.out.println("f. \uD83D\uDC7E Imprimir Catálogo Categoria");
                System.out.println("g. \uD83C\uDD95 Imprimir Jogo Mais Recente");
                System.out.println("z. ❌ Sair");

                opcao = inTeclado.next();
                inTeclado.nextLine();
                opcao = opcao.toLowerCase();
            }

        } while (!opcao.equals("z"));
    }
}
