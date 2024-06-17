package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int lim, salto;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o limite.");
        lim = in.nextInt();
        System.out.println("Introduza o salto.");
        salto = in.nextInt();

        for(int i = 0; i <= lim; i = i + salto){
            System.out.println(i);
        }
    }
}
