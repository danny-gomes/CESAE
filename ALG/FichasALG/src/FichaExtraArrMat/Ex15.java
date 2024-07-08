package FichaExtraArrMat;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        System.out.println("MEDIA ELEMENTOS MATRIZ");
        Scanner in = new Scanner(System.in);
        int colunas = 3;
        int linhas = 4;
        int soma = 0;

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduza posicao [" + i + "," + j + "]");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
        }

        double media = soma / (linhas * colunas);

        System.out.println("Media: " + media);
    }
}

