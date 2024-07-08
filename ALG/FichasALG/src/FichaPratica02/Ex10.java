package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        double num1, num2;
        double resultado = 0;
        boolean operadorCorreto = true;
        String operador;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza um numero.");
        num1 = in.nextDouble();

        System.out.println("Introduza outro numero.");
        num2 = in.nextDouble();

        System.out.println("Introduza a operacao (+ - * / %).");
        operador = in.next();

        switch(operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "%":
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operador invalido.");
                operadorCorreto = false;
        }

        if(operadorCorreto){
            System.out.println("Resultado: " + resultado);
        }
    }
}
