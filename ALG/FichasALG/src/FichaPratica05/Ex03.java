package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] arr = new int[tamanho];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza um valor " + i);
            arr[i] = in.nextInt();
        }

        int maior = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maior){
                maior = arr[i];
            }
        }

        System.out.println("Maior valor: " + maior);
    }
}
