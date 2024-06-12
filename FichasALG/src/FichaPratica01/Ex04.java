package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public Ex04() {
    }

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o raio.");
        int raio = in.nextInt();
        double perimetro = 2.0 * pi * (double)raio;
        double area = 2.0 * pi * (double)raio * (double)raio;
        System.out.println("Perimetro: " + perimetro + "cm");
        System.out.println("Area: " + area + "cm2");
    }
}
