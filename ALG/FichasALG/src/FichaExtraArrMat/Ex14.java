package FichaExtraArrMat;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println("SOMAR MATRIZ");
        Scanner in = new Scanner(System.in);
        int colunas = 3;
        int linhas = 4;

        int[][] matriz1 = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                System.out.println("Introduza posicao [" + i + "," + j + "]");
                matriz1[i][j] = in.nextInt();
            }
        }

        int[][] matriz2 = {{1,1,1},{2,2,2},{3,3,3},{4,4,4}};
        int[][] matrizSoma = new int[4][3];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matrizSoma[i].length; j++){
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
