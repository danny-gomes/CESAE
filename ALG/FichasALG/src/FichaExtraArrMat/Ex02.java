package FichaExtraArrMat;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("IMPRIMIR ORDEM INVERSA INSERCAO");
        Scanner in = new Scanner(System.in);
        int tamanho = 14;
        int[] arr = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        for(int i = tamanho - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
