package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] arr = new int[tamanho];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza um valor " + i);
            arr[i] = in.nextInt();
        }

        int menor = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < menor){
                menor = arr[i];
            }
        }

        System.out.println("Menor valor: " + menor);
    }
}
