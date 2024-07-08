package FichaExtraArrMat;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("CRIAR ARRAY COM PARES E IMPARES");
        Scanner in = new Scanner(System.in);
        int tamanho = 15;
        int[] arr = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        int[] pares = new int[tamanho];
        int[] impares = new int[tamanho];
        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pares[countPares] = arr[i];
                countPares++;
            } else {
                impares[countImpares] = arr[i];
                countImpares++;
            }
        }

        if (countPares == 0) {
            System.out.println("Nao ha pares.");
        } else {
            System.out.print("Pares: ");
            for (int i = 0; i < countPares; i++) {
                System.out.print(pares[i] + " ");
            }
        }

        if (countImpares == 0) {
            System.out.println("Nao ha impares.");
        } else {
            System.out.print("\nImpares: ");
            for (int i = 0; i < countImpares; i++) {
                System.out.print(impares[i] + " ");
            }
        }

    }
}
