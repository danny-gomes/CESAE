package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero maior que 2.");
        num = in.nextInt();

        for(int i = 2; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
