package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public Ex07() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza primeiro preco.");
        double preco1 = in.nextDouble();
        System.out.println("Segundo preco.");
        double preco2 = in.nextDouble();
        System.out.println("Mais um.");
        double preco3 = in.nextDouble();
        double total = preco1 + preco2 + preco3;
        total *= 0.9;
        System.out.println("Preco com 10% desconto: " + total + "€");
    }
}
