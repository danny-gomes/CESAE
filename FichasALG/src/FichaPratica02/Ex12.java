package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int opcao;
        Scanner in = new Scanner(System.in);
        String mensagemMenu = "Introduza uma opcao:\n1- Imprimir 1\n2- Imprimir 2" +
                "\n3- Imprimir 3\n4- Sair";

        do{
            System.out.println(mensagemMenu);
            opcao = in.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("---1---");
                   break;
                case 2:
                    System.out.println("---2---");
                    break;
                case 3:
                    System.out.println("---3---");
                    break;
                case 4:
                    break;
            }
        }while(opcao != 4);
    }
}
