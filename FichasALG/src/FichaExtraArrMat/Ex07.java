package FichaExtraArrMat;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("REMOVER TODAS OCORRENCIAS DE UM VALOR");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o tamanho do array.");
        int tamanho = in.nextInt();
        int[] arr = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        System.out.println("Introduza o valor a remover.");
        int valorRemover = in.nextInt();
        int ocorrencias = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valorRemover) {
                ocorrencias++;
            }
        }

        if (ocorrencias == 0) {
            System.out.println("Nao existe esse valor.");
        } else {
            int[] arrayEditado = new int[tamanho - ocorrencias];
            int indArrOriginal = 0;
            for (int i = 0; i < arrayEditado.length; i++) {
                if(arr[indArrOriginal] != valorRemover){
                    arrayEditado[i] = arr[indArrOriginal];
                    indArrOriginal++;
                } else {
                    indArrOriginal++;
                    i--;
                }
            }

            System.out.print("Original: ");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

            System.out.print("\nEditado: ");
            for(int i = 0; i < arrayEditado.length; i++){
                System.out.print(arrayEditado[i] + " ");
            }
        }
    }
}
