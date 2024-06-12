package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public Ex05() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        int num1 = in.nextInt();

        System.out.println("Introduza outro numero.");
        int num2 = in.nextInt();

        System.out.println("Mais um.");
        int num3 = in.nextInt();

        int soma = num1 + num2 + num3;
        double media = (double)soma / 3.0;
        double mediaPonderada = (double)num1 * 0.2 + (double)num2 * 0.3 + (double)num3 * 0.5;

        System.out.println("Media: " + media);
        System.out.println("Media Ponderada(20% 30% 50%): " + mediaPonderada);
    }
}
