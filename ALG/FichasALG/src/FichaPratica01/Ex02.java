package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public Ex02() {
    }

    public static void main(String[] args) {
        System.out.println("Introduza um numero.");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        System.out.println("Introduza outro numero.");
        int num2 = input.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double)(num1 / num2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }
}
