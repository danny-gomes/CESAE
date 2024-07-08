package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int horas, minutos;
        String manhaOuTarde = "AM";
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza as horas.");
        horas = in.nextInt();
        System.out.println("Introduza os minutos.");
        minutos = in.nextInt();

        if(horas >= 12){
            horas = horas - 12;
            manhaOuTarde = "PM";
        }

        System.out.println(horas + ":" + minutos + " " + manhaOuTarde);
    }
}
