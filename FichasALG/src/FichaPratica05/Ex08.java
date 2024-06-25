package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int colunas = 3;
        int linhas = 3;

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Introduza posicao [" + i + "," + j + "]");
                matriz[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
