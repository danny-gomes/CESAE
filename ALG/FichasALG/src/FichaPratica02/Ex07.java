package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero");
        num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("Par.");
        } else {
            System.out.println("Impar.");
        }
    }
}
