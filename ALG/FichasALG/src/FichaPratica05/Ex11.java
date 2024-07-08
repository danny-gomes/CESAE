package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhas = 3;
        int colunas = 3;
        int[][] mat = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.println("Introduza um numero.");
                mat[i][j] = in.nextInt();
            }
        }

        int maior = mat[0][0];
        int menor = mat[0][0];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(mat[i][j] > maior){
                    maior = mat[i][j];
                }

                if(mat[i][j] < menor){
                    menor = mat[i][j];
                }
            }
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }
}
