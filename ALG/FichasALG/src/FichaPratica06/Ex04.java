package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("ANALISE DE UM NUMERO");
        System.out.println("Introduza numero a ser analisado.");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int opcao;

        String menu = "Escolha uma opcao:\n1 - Par ou Impar\n2 - Positivo ou Negativo" +
                "\n3 - Primo ou Nao Primo\n4 - Perfeito ou Nao Perfeito\n" +
                "5 - Triangular ou Nao Triangular\n6 - Trocar de Numero\n7 - Sair";

        do {
            System.out.println(menu);
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    if (checkParidade(num)) {
                        System.out.println("Numero Par.");
                    } else {
                        System.out.println("Numero Impar");
                    }
                    break;
                case 2:
                    if (checkSinal(num)) {
                        System.out.println("Numero Positivo.");
                    } else {
                        System.out.println("Numero Negativo");
                    }
                    break;
                case 3:
                    if (checkPrimo(num)) {
                        System.out.println("Numero Primo.");
                    } else {
                        System.out.println("Numero nao Primo");
                    }
                    break;
                case 4:
                    if (checkPerfeito(num)) {
                        System.out.println("Numero Perfeito.");
                    } else {
                        System.out.println("Numero nao Perfeito");
                    }
                    break;
                case 5:
                    if (checkTriangular(num)) {
                        System.out.println("Numero Triangular.");
                    } else {
                        System.out.println("Numero nao Triangular");
                    }
                    break;
                case 6:
                    System.out.println("Introduza novo numero");
                    num = in.nextInt();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
            System.out.println("\n");
        } while (opcao != 7);
    }


}
