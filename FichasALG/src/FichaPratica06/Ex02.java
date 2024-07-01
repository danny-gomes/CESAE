package FichaPratica06;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int num = lerInteiroPositivo();

        System.out.println(num);
    }

    public static int lerInteiroPositivo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduz um numero.");
        int numAler = in.nextInt();
        while(numAler < 0){
            System.out.println("Tem de ser positivo inteiro.");
            numAler = in.nextInt();
        }

        return numAler;
    }
}
