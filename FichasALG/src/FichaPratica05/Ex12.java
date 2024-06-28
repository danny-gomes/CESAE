package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas = 2;
        int colunas = 10;
        int[] linha1 = new int[10];
        int[] linha2 = new int[10];
        int[][] mat = new int[linhas][colunas];

        for(int i = 0; i < linha1.length; i++){
            System.out.println("Introduza valor para primeira linha, posicao: " + i);
            linha1[i] = in.nextInt();
            System.out.println("Introduza valor para segunda linha, posicao: " + i);
            linha2[i] = in.nextInt();
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(i == 0){
                    mat[i][j] = linha1[j];
                } else {
                    mat[i][j] = linha2[j];
                }
            }
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
