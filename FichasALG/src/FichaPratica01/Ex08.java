package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public Ex08() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza minutos da musica 1.");
        int minuto1 = in.nextInt();
        System.out.println("Introduza segundos da musica 1.");
        int segundo1 = in.nextInt();
        int totalSegundos = minuto1 * 60 + segundo1;
        System.out.println("Introduza minutos da musica 2.");
        int minuto2 = in.nextInt();
        System.out.println("Introduza segundos da musica 2.");
        int segundo2 = in.nextInt();
        totalSegundos += minuto2 * 60 + segundo2;
        System.out.println("Introduza minutos da musica 3.");
        int minuto3 = in.nextInt();
        System.out.println("Introduza segundos da musica 3.");
        int segundo3 = in.nextInt();
        totalSegundos += minuto3 * 60 + segundo3;
        System.out.println("Introduza minutos da musica 4.");
        int minuto4 = in.nextInt();
        System.out.println("Introduza segundos da musica 4.");
        int segundo4 = in.nextInt();
        totalSegundos += minuto4 * 60 + segundo4;
        System.out.println("Introduza minutos da musica 5.");
        int minuto5 = in.nextInt();
        System.out.println("Introduza segundos da musica 5.");
        int segundo5 = in.nextInt();
        totalSegundos += minuto5 * 60 + segundo5;
        int totalMinutos = totalSegundos / 60;
        totalSegundos %= 60;
        int totalHoras = totalMinutos / 60;
        totalMinutos %= 60;
        System.out.println("Total do album: " + totalHoras + "h " + totalMinutos + "m " + totalSegundos + "s");
    }
}
