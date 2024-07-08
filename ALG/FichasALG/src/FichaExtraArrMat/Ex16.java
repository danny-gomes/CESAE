package FichaExtraArrMat;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        System.out.println("MAIOR E MENOR MATRIZ");
        Scanner in = new Scanner(System.in);
        int colunas = 3;
        int linhas = 3;

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduza posicao [" + i + "," + j + "]");
                matriz[i][j] = in.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }
}

