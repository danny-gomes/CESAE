package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero");
        num = in.nextInt();

        for (int i = num - 5; i <= num + 5; i++) {
            if(i == num){
            } else {
                System.out.println(i);
            }
        }
    }
}
