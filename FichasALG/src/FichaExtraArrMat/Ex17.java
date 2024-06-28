package FichaExtraArrMat;

import java.util.Scanner;

public class Ex17 {
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
        int linhaMaior = 0;
        int colMaior = 0;
        int linhaMenor = 0;
        int colMenor = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    linhaMenor = i;
                    colMenor = j;
                }

                if (matriz[i][j] > maior) {
                    linhaMaior = i;
                    colMaior = j;
                }
            }
        }

        int linhaNovaMaior = 0;
        int colNovaMaior = 0;
        int linhaNovaMenor = 0;
        int colNovaMenor = 0;

        if (linhaMaior == 0 || linhaMaior == 1) {
            linhaNovaMaior = linhaMaior + 1;
        } else if (linhaMaior == 2) {
            linhaNovaMaior = linhaMaior - 1;
        }

        if (colMaior == 0 || colMaior == 1) {
            colNovaMaior = colMaior + 1;
        } else if (colMaior == 2) {
            colNovaMaior = colMaior - 1;
        }

        if (linhaMenor == 0 || linhaMenor == 1) {
            linhaNovaMenor = linhaMenor + 1;
        } else if (linhaMenor == 2) {
            linhaNovaMenor = linhaMenor - 1;
        }

        if (colMenor == 0 || colMenor == 1) {
            colNovaMenor = colMenor + 1;
        } else if (colMenor == 2) {
            colNovaMenor = colMenor - 1;
        }

        matriz[linhaMaior][colMaior] = matriz[linhaNovaMaior][colNovaMaior];
        matriz[linhaMenor][colMenor] = matriz[linhaNovaMenor][colNovaMenor];

        System.out.println("0000000000");
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }


                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

            }
        }

        System.out.println("Segundo Maior: " + maior + "\nSegundo Menor: " + menor);
    }
}

