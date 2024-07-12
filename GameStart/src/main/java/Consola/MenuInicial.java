package Consola;

import java.util.Scanner;

import static Consola.Admin.loginAdmin;
import static Consola.Admin.menuAdmin;
import static Consola.Cliente.menuCliente;
import static Dados.ImportarFicheiros.imprimirFicheiro;
import static Dados.ImportarFicheiros.lerFicheiro;

public class MenuInicial {

    public static void main(String[] args) {

        /*********** DADOS E VARIÁVEIS PERTINENTES ***********/
        String pathVendas = "Dados/GameStart_Vendas.csv";
        String[][] vendas = lerFicheiro(pathVendas, 6, true);

        String pathClientes = "Dados/GameStart_Clientes.csv";
        String[][] clientes = lerFicheiro(pathClientes, 4, true);

        String pathComissoes = "Dados/GameStart_Categorias.csv";
        String[][] comissoes = lerFicheiro(pathComissoes, 2, true);

        String pathAdmin = "Dados/GameStart_Admins.csv";
        String[][] acessoAdmin = lerFicheiro(pathAdmin, 2, false);
        int opcao;
        int tentativasOpcao = 0;

        Scanner inTeclado = new Scanner(System.in);
        /********************************************/

        /*********** MENU CLIENTE-ADMIN ***********/

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
        // opcao = 1;
        // ADICIONAR OPCAO SAIR ?????

        while (opcao != 1 && opcao != 2) {
            System.out.println("\n");
            System.out.println("Opção inválida, tenta outra vez (¬_¬\")");
            System.out.println("1. Admin \uD83D\uDEE0\uFE0F");
            System.out.println("2. Cliente \uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F");
            opcao = inTeclado.nextInt();
            tentativasOpcao++;

            if (tentativasOpcao == 2) {
                System.out.println("\n");
                System.out.println("\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80 Precisas de óculos ?? \uD83D\uDC80\uD83D\uDC80\uD83D\uDC80\uD83D\uDC80");
            }
        }
        /********************************************/


        /*********** MENU ADMIN ***********/

        if (opcao == 1) {
            System.out.print("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83D\uDCBB Username: ");
            inTeclado.nextLine();
            String username = inTeclado.nextLine();

            System.out.print("\uD83D\uDD12 Password: ");
            String password = inTeclado.nextLine();

            if (loginAdmin(acessoAdmin, username, password)) {
                menuAdmin(username, vendas, clientes, comissoes);
            } else {
                do {
                    System.out.println("\n⛔ LOGIN INVÁLIDO ⛔\n");
                    System.out.print("\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83D\uDCBB Username: ");
                    username = inTeclado.nextLine();

                    System.out.print("\uD83D\uDD12 Password: ");
                    password = inTeclado.nextLine();
                } while (!loginAdmin(acessoAdmin, username, password));

                menuAdmin(username, vendas, clientes, comissoes);
            }
        } else {
            /*********** MENU CLIENTE ***********/
            menuCliente(vendas, clientes, comissoes);
        }

        imprimirFicheiro("Dados/GameStart_Copyright.txt");

    }
}
