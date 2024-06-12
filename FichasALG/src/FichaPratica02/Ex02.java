package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int salario;
        double imposto;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o salario.");
        salario = in.nextInt();

        if(salario < 15000) {
            imposto = salario * 0.2;
        } else {
            imposto = salario * 0.3;
        }

        System.out.println("Imposto: " + imposto);
    }
}
