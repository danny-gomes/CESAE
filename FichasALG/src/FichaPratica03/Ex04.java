package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num = in.nextInt();

        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }
}
