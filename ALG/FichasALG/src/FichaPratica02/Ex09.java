package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int menor = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num1 = in.nextInt();

        System.out.println("Introduza outro numero.");
        num2 = in.nextInt();

        System.out.println("Mais um.");
        num3 = in.nextInt();

        if(num1 < num2){
            if(num1 < num3){
                menor = num1;
            }
        } else if(num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        System.out.println("Menor dos numeros: " + menor);
    }
}
