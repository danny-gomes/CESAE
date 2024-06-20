package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Introduza um numero");
        num = in.nextInt();
        while (num < 0) {
            System.out.println("Nao pode ser negativo");
            num = in.nextInt();
        }

        int aux = 0;
        int fatorial = num;
        while (num > 1) {
            for (int i = 1; i < num; i++) {
                aux = aux + fatorial;
            }

            num = num - 1;
            fatorial = aux;
            aux = 0;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
