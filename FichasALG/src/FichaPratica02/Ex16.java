package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int valor;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o valor.");
        valor = in.nextInt();
        int notas200, notas100, notas50, notas10, notas5;

        notas200 = valor / 200;
        valor = valor % 200;

        notas100 = valor / 100;
        valor = valor % 100;

        notas50 = valor / 50;
        valor = valor % 50;

        notas10 = valor / 10;
        valor = valor % 10;

        notas5 = valor / 5;
        valor = valor % 5;

        System.out.println("Valor decomposto:\n" +
                "Notas 200: " + notas200 +"\nNotas 100: " + notas100 + "\nNotas 50: " + notas50 +
                "\nNotas 10: " + notas10 + "\nNotas 5: " + notas5 + "\nSobra: " + valor + " em moedas.");
    }
}
