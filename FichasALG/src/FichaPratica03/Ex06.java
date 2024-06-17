package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num1 = in.nextInt();
        System.out.println("Introduza outro numero.");
        num2 = in.nextInt();

        if (num2 < num1) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for(int i = num1; i <= num2; i++){
            System.out.println(i);
        }
    }
}
