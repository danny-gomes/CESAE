package Consola;

import java.util.Scanner;

import static Dados.ImportarFicheiros.imprimirFicheiro;
import static FuncoesUtilitarias.Utils.*;
import static FuncoesUtilitarias.utilsCliente.*;

public class Cliente {
    public static void menuCliente(String[][] vendas, String[][] clientes, String[][] comissoes) {
        System.out.println("\n\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E「 ✦ Bem-vindo á GameStart! ✦ 」\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E\n");
        System.out.println("Escolha uma opção:");
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

        do {
            switch (opcao) {
                case "a":
                    System.out.println("Introduza o nome:");
                    String nome = inTeclado.nextLine();
                    System.out.println("Introduza o email:");
                    String email = inTeclado.next();
                    inTeclado.nextLine();
                    System.out.println("Introduza o contacto.");
                    String contacto = inTeclado.next();
                    inTeclado.nextLine();
                    String[] novoCliente = simulaRegistoCliente(Double.toString(clientes.length + 1), nome, contacto, email);
                    System.out.println("CLIENTE REGISTADO COM SUCESSO");
                    imprimirCliente(novoCliente);
                    break;
                case "b":
                    int[] lugaresVagos = lugaresVagos();
                    imprimirLugarsVagos(lugaresVagos);
                    break;
                case "c":
                    String[] catalogo = getCatalogo(vendas);
                    imprimirCatalogo(catalogo);
                    break;
                case "d":
                    System.out.println("Escolha o catálogo a imprimir.");
                    int opcaoCat = 0;
                    do {
                        System.out.println("1 - Call of Duty");
                        System.out.println("2 - Hollow Knight");
                        System.out.println("3 - Fifa");
                        System.out.println("4 - Mortal Kombat");
                        System.out.println("5 - Overcooked");
                        System.out.println("6 - Witcher 3: Wild Hunt");
                        System.out.println("7 - Minecraft");
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
                    System.out.println("Introduza a editora a pesquisar.");
                    String editora = inTeclado.nextLine();
                    String[][] jogosPorCategoriaEditora = jogosEditora(vendas, editora);
                    if (jogosPorCategoriaEditora == null) {
                        System.out.println("Categoria não encontrada.");
                    } else {
                        imprimirJogosPorEditora(jogosPorCategoriaEditora, "CATEGORIA:");
                    }
                    break;
                case "f":
                    System.out.println("Introduza a categoria a pesquisar.");
                    String categoria = inTeclado.nextLine();
                    String[][] jogosPorEditoraCategoria = jogosCategoria(vendas, categoria);
                    if (jogosPorEditoraCategoria == null) {
                        System.out.println("Categoria não encontrada.");
                    } else {
                        imprimirJogosPorEditora(jogosPorEditoraCategoria, "EDITORA:");
                    }
                    break;
                case "g":
                    System.out.println("Jogo Mais Recente: " + getJogoMaisRecente(vendas));
                    break;
                case "z":
                    System.out.println("Ainda não implementado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (!opcao.equals("z")) {
                System.out.println("\n\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E「 ✦ Bem-vindo á GameStart! ✦ 」\uD83C\uDFAE\uD83D\uDD79\uFE0F\uD83D\uDC7E\n");
                System.out.println("Escolha uma opção:");
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
