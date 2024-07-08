package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int colunas = 5;
        int linhas = 3;

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Introduza posicao [" + i + "," + j + "]");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("Introduza um numero a pesqusiar.");
        int numPesquisar = in.nextInt();
        int encontros = 0;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == numPesquisar){
                    encontros++;
                }
            }
        }

        System.out.println("Encontros: " + encontros);
    }
}
