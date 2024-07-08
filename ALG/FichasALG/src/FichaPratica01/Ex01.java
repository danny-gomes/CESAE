package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    public Ex01() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero");
        int num1 = input.nextInt();

        System.out.println("Insira outro numero");
        int num2 = input.nextInt();
        int soma = num1 + num2;

        System.out.println("Soma: " + soma);
    }
}