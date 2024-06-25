package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int tamanho = 12;
        int[] arr = new int[tamanho];
        int num;
        int totalAnual = 0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza comisssao para mes " + (i + 1));
            num = in.nextInt();
            arr[i] = num;
        }

        for(int i = 0; i < arr.length; i++){
            totalAnual = totalAnual + arr[i];
        }

        System.out.println("Total anual: " + totalAnual);
    }
}
