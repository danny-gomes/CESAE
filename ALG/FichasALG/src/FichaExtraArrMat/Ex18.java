package FichaExtraArrMat;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        System.out.println("TRANSPOSTA");
        Scanner in = new Scanner(System.in);

        System.out.println("Quantas colunas?");
        int colunas = in.nextInt();
        System.out.println("Quantas linhas?");
        int linhas = in.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduza posicao [" + i + "," + j + "]");
                matriz[i][j] = in.nextInt();
            }
        }

        int[][] matrizTransposta = new int[colunas][linhas];

        for(int i = 0; i < matrizTransposta.length; i++){
            for(int j = 0; j < matrizTransposta[0].length; j++){
                matrizTransposta[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz Original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz Transposta:");
        imprimirMatriz(matrizTransposta);
    }

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
