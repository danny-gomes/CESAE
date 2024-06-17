package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int num;
        String mensagem;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num = in.nextInt();
        System.out.println("Introduza uma mensagem");
        mensagem = in.next();

        for(int i = 0; i < num; i++){
            System.out.println(mensagem);
        }
    }
}
