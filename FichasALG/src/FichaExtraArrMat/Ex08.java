package FichaExtraArrMat;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println("ADICIONAR VALOR A UMA POSICAO DO ARRAY");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o tamanho do array.");
        int tamanho = in.nextInt();
        int[] arr = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        int posAdicionar;
        System.out.println("Em que posicao quer acrescentar um valor?");
        posAdicionar = in.nextInt();

        while(posAdicionar > tamanho ){
            System.out.println("Posicao a adicionar invalida.");
            posAdicionar = in.nextInt();
        }

        int valorAdicionar;
        System.out.println("Qual o valor a adicionar?");
        valorAdicionar = in.nextInt();

        int[] arrayEditado = new int[tamanho + 1];
        int indArrOriginal = 0;
        for(int i = 0; i < arrayEditado.length; i++){
            if(i == posAdicionar){
                arrayEditado[i] = valorAdicionar;
            } else {
                arrayEditado[i] = arr[indArrOriginal];
                indArrOriginal++;
            }
        }

        for(int i = 0; i < arrayEditado.length; i++){
            System.out.print(arrayEditado[i] + " ");
        }
    }
}
