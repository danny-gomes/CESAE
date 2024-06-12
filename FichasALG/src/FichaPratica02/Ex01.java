package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num1 = in.nextInt();

        System.out.println("Introduza outro numero.");
        num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("Numero maior:" + num1);
        } else if(num2 > num1){
            System.out.println("Numero maior: " + num2);
        } else {
            System.out.println("Numeros iguais.");
        }
    }
}
