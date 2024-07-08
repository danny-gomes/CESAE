package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int limSup, limInf;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza limite superior.");
        limSup = in.nextInt();
        System.out.println("Introduza limite inferior.");
        limInf = in.nextInt();

        if(limInf > limSup){
            int aux = limInf;
            limInf = limSup;
            limSup = aux;
        }

        for(int i = limInf; i <= limSup; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
