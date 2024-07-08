package FichaExtraArrMat;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("ORDERNAR ARRAY ORDEM CRESCENTE");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o tamanho do array.");
        int tamanho = in.nextInt();
        int[] arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int menor = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
