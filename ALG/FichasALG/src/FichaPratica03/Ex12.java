package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int num;
        int men25 = 0;
        int men50 = 0;
        int men75 = 0;
        int men100 = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num = in.nextInt();
        do{
           if(num >= 0 && num <= 25){
               men25++;
           } else if(num <= 50){
               men50++;
           } else if(num <= 75){
               men75++;
           } else if(num <= 100){
               men100++;
           }
            System.out.println("Outro.");
            num = in.nextInt();

        }while(num > 0);

        System.out.println("[00,25]: " + men25 + "\n[26,50]: " + men50 + "\n[51,75]: " + men75 + "\n[76,100]: " + men100);
    }
}
