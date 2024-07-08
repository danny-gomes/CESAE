package FichaExtraArrMat;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        System.out.println("SEGUNDO MAIOR E SEGUNDO MENOR MATRIZ");
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
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colMenor = j;
                }

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colMaior = j;
                }
            }
        }

        int novoValor = matriz[0][0];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] < maior && matriz[i][j] > menor){
                    novoValor = matriz[i][j];
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                    break;
                }
            }
        }



        matriz[linhaMaior][colMaior] = novoValor;
        matriz[linhaMenor][colMenor] = novoValor;

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

