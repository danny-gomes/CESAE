package Consola;

import java.util.Scanner;

import static FuncoesUtilitarias.Utils.imprimirMatriz;
import static LeituraEscrita.ImportarFicheiros.lerFicheiro;

public class Menu {

    static String[][] vendas;
    static String pathVendas = "Dados/GameStart_Vendas.csv";
    static String[][] clientes;
    static String pathClientes = "Dados/GameStart_Clientes.csv";
    static String[][] comissoes;
    static String pathComissoes = "Dados/GameStart_Categorias.csv";
    static String[][] acessoAdmin;
    static String pathAdmin = "Dados/GameStart_Admins.csv";

    public static void main(String[] args) {
        vendas = lerFicheiro(pathVendas, 6, true);
        clientes = lerFicheiro(pathClientes, 4, true);
        comissoes = lerFicheiro(pathComissoes, 2, true);
        acessoAdmin = lerFicheiro(pathAdmin, 2, false);
        int opcao;
        int tentativasOpcao = 0;

        Scanner inTeclado = new Scanner(System.in);

        System.out.println("\n" +
                " _____                          _____  _                 _      \n" +
                "|  __ \\                        /  ___|| |               | |     \n" +
                "| |  \\/  __ _  _ __ ___    ___ \\ `--. | |_   __ _  _ __ | |_    \n" +
                "| | __  / _` || '_ ` _ \\  / _ \\ `--. \\| __| / _` || '__|| __|   \n" +
                "| |_\\ \\| (_| || | | | | ||  __//\\__/ /| |_ | (_| || |   | |_    \n" +
                " \\____/ \\__,_||_| |_| |_| \\___|\\____/  \\__| \\__,_||_|    \\__|   \n" +
                " ______  ______  ______  ______  ______  ______  ______  ______ \n" +
                "|______||______||______||______||______||______||______||______|\n" +
                "                                                                \n");

        System.out.println("「 ✦ Bem-vindo á aplicação de gestão da GameStart ✦ 」");
        System.out.println("Escolha uma opção:\n");
        System.out.println("1. Admin \uD83D\uDEE0\uFE0F");
        System.out.println("2. Cliente \uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F");

        opcao = inTeclado.nextInt();

        // ADICIONAR OPCAO SAIR ?????

        while (opcao != 1 || opcao != 2) {
            System.out.println("\n");
            System.out.println("Opção inválida, tenta outra vez (¬_¬\")");
            System.out.println("1. Admin \uD83D\uDEE0\uFE0F");
            System.out.println("2. Cliente \uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F");
            opcao = inTeclado.nextInt();
            tentativasOpcao++;

            if(tentativasOpcao == 2){
                System.out.println("\n");
                System.out.println("\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80 Precisas de óculos ?? \uD83D\uDC80\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80");
            }
        }

        if(opcao == 1) {

        }


    }
}
