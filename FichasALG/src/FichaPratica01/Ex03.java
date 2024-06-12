package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public Ex03() {
    }

    public static void main(String[] args) {
        System.out.println("Introduza largura.");
        Scanner input = new Scanner(System.in);
        int largura = input.nextInt();
        System.out.println("Introduza cumprimento.");
        int cumprimento = input.nextInt();
        int perimetro = largura * 2 + cumprimento * 2;
        int area = largura * cumprimento;
        System.out.println("Perimetro: " + perimetro + "cm Area: " + area + "cm2");
    }
}
