package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int num1, num2, num3, menor;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduza um numero.");
        num1 = in.nextInt();
        System.out.println("Outro.");
        num2 = in.nextInt();
        System.out.println("Mais um.");
        num3 = in.nextInt();

        menor = numeroMaisPequeno(num1, num2, num3);

        System.out.println("Menor: " + menor);
    }

    public static int numeroMaisPequeno(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3) {
            return num1;
        }

        if(num2 < num1 && num2 < num3){
            return num2;
        }

        return num3;
    }
}
