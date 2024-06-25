package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] arr = new int[tamanho];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza um valor " + i);
            arr[i] = in.nextInt();
        }

        boolean isCrescente = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                isCrescente = false;
                break;
            }
        }

        if(isCrescente){
            System.out.println("Crescente");
        } else {
            System.out.println("Nao Cresecente");
        }
    }
}
