package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza uma nota.");
        nota1 = in.nextDouble();

        System.out.println("Introduza outra nota.");
        nota2 = in.nextDouble();

        System.out.println("Mais uma.");
        nota3 = in.nextDouble();

        media = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        if(media > 9.5){
            System.out.println("Aluno passou com media: " + media);
        } else {
            System.out.println("Aluno reprovou com media: " + media);
        }


    }
}
