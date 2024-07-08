package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int colunas = 5;
        int linhas = 5;
        int soma = 0;

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Introduza posicao [" + i + "," + j + "]");
                matriz[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                soma = soma + matriz[i][j];
            }
        }

        System.out.println("Soma: " + soma);
    }
}
