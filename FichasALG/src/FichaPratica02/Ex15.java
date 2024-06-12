package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int num1, num2, num3;
        String opcao;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num1 = in.nextInt();

        System.out.println("Introduza outro numero.");
        num2 = in.nextInt();

        System.out.println("Mais um.");
        num3 = in.nextInt();

        System.out.println("Cresecente ou Decresecente (C/D)?");
        opcao = in.next();

        int primeiro = num1;
        int segundo = num2;
        int terceiro = num3;

        if (num1 < num2) {
            if (num1 < num3) {
                primeiro = num1;
                if (num2 < num3) {
                    segundo = num2;
                    terceiro = num3;
                } else {
                    segundo = num3;
                    terceiro = num2;
                }
            } else {
                primeiro = num3;
                segundo = num1;
                terceiro = num2;
            }
        } else if (num2 < num1) {
            if (num2 < num3) {
                primeiro = num2;
                if (num1 < num3) {
                    segundo = num1;
                    terceiro = num3;
                } else {
                    segundo = num3;
                    terceiro = num1;
                }
            } else {
                primeiro = num3;
                segundo = num2;
                terceiro = num1;
            }
        }

        if (opcao.equalsIgnoreCase("C")) {
            System.out.println(primeiro + " " + segundo + " " + terceiro);
        } else{
            System.out.println(terceiro + " " + segundo + " " + primeiro);
        }
    }
}
