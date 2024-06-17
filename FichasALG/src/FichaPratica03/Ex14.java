package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mensagem = "";

        int num = in.nextInt();
        mensagem = mensagem +  in.nextLine();

        System.out.println(mensagem);
    }
}
