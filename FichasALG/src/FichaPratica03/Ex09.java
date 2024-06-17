package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int num;
        int soma = 0;
        int qtdNum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num = in.nextInt();
        do{
            soma = soma + num;
            qtdNum++;
            System.out.println("Outro.");
            num = in.nextInt();

        }while(num != -1);

        double media = soma / qtdNum;
        System.out.println("Media: " + media);

    }
}
