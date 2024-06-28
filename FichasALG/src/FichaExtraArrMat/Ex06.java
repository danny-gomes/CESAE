package FichaExtraArrMat;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("CRIAR ARRAY TAMANHO DEFINIDO UTILIZADOR");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o tamanho do array.");
        int tamanho = in.nextInt();
        int[] arr = new int[tamanho];
        int[] posicoesEncontradas = new int[tamanho];
        int encontrados = 0;

        for(int i = 0; i < tamanho; i++){
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
