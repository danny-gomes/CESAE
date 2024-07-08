package FichaExtraArrMat;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("PESQUISAR NUMERO NO ARRAY");
        Scanner in = new Scanner(System.in);
        int tamanho = 10;
        int[] arr = new int[tamanho];
        int posicaoEncontrada = -1;

        for(int i = 0; i < tamanho; i++){
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        int numeroPesquisar;
        System.out.println("Introduza um numero a pesquisar");
        numeroPesquisar = in.nextInt();

        for(int i = 0; i < tamanho; i++){
            if(arr[i] == numeroPesquisar){
                posicaoEncontrada = i;
            }
        }

        if(posicaoEncontrada != -1){
            System.out.println("Numero encontrado na posicao " + posicaoEncontrada);
        } else {
            System.out.println("Nao encontrado.");
        }
    }
}
