package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public Ex06() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        int valor1 = in.nextInt();

        System.out.println("Introduza outro numero.");
        int valor2 = in.nextInt();

        System.out.println("Valor1 atual: " + valor1);
        System.out.println("Valor2 atual: " + valor2);
        System.out.println("Valor1 Novo: " + valor2);
        System.out.println("Valor2 Novo: " + valor1);
    }
}
