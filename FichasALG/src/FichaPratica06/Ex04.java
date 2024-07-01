package FichaPratica06;

import java.util.Scanner;

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
                    boolean isPar = checkParidade(num);
                    break;
                case 2:
                    boolean isPositivo = checkSinal(num);
                    break;
                case 3:
                    boolean isPrimo = checkPrimo(num);
                    break;
                case 4:
                    boolean isPerfeito = checkPerfeito(num);
                    break;
                case 5:
                    boolean isTriangular = checkTriangular(num);
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
        } while (opcao != 7);
    }

    private static boolean checkTriangular(int num) {
        int count = 0;
        int soma = 0;
        while(soma < num){
            soma = soma + count;
            count++;
        }
        if(soma == num){
            System.out.println("Numero Triangular");
            return true;
        }

        System.out.println("Numero nao Triangular");
        return false;
    }

    private static boolean checkPerfeito(int num) {
        int somaDiv = 0;
        for(int i = num / 2; i > 0; i--){
            if(num % i == 0){
                somaDiv = somaDiv + i;
            }
        }

        if(somaDiv == num){
            System.out.println("Numero Perfeito");
            return true;
        }

        System.out.println("Nao Perfeito");
        return false;
    }

    private static boolean checkPrimo(int num) {
        boolean isPrimo = true;
        for (int i = num / 2; i > 1; i--) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo && num != 0) {
            System.out.println("Numero Primo");
            return true;
        } else {
            System.out.println("Numero nao Primo.");
            return false;
        }
    }

    private static boolean checkSinal(int num) {
        if (num < 0) {
            System.out.println("Numero Negativo");
            return false;
        } else if (num > 0) {
            System.out.println("Numero Positivo");
            return true;
        } else {
            System.out.println("Zero");
            return true;
        }
    }

    private static boolean checkParidade(int num) {
        if (num % 2 == 0) {
            System.out.println("Numero Par");
            return true;
        } else {
            System.out.println("Numero Impar.");
            return false;
        }
    }
}
