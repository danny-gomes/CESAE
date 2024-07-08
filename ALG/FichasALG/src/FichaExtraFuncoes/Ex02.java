package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double num1, num2, num3, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza um numero.");
        num1 = in.nextInt();
        System.out.println("Outro.");
        num2 = in.nextInt();
        System.out.println("Mais um.");
        num3 = in.nextInt();

        media = media(num1, num2, num3);

        System.out.println("Media: " + media);
    }

    public static double media(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;
    }
}
