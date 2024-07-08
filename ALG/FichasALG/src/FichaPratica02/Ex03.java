package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int salario;
        double imposto;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o salario.");
        salario = in.nextInt();

        if(salario < 15000){
            imposto = salario * 0.2;
        } else if(salario < 20000){
            imposto = salario * 0.3;
        } else if(salario < 25000){
            imposto = salario * 0.35;
        } else {
            imposto = salario * 0.4;
        }

        System.out.printf("Imposto: " + imposto);
    }
}
