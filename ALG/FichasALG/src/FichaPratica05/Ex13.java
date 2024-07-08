package FichaPratica05;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas = 4;
        int colunas = 4;
        int[][] mat = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.println("Introduza um numero.");
                mat[i][j] = in.nextInt();
            }
        }

        int soma = 0;

        for(int i = 0; i < linhas; i++){
            soma = soma + mat[i][i];
        }

        System.out.println("Soma diagonal principal: " + soma);
    }
}
