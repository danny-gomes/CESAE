package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int lugar;
        int pontos = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o lugar do condutor.");
        lugar = in.nextInt();

        switch (lugar) {
            case 1:
                pontos = 10;
                break;
            case 2:
                pontos = 8;
                break;
            case 3:
                pontos = 6;
                break;
            case 4:
                pontos = 5;
                break;
            case 5:
                pontos = 4;
                break;
            case 6:
                pontos = 3;
                break;
            case 7:
                pontos = 2;
                break;
            case 8:
                pontos = 1;
                break;
            default:

        }

        System.out.println("Pontos: " + pontos);
    }
}
