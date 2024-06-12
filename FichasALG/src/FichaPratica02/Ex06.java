package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num1 = in.nextInt();

        System.out.println("Introduza outro numero.");
        num2 = in.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
    }
}
