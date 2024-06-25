package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] arr = new int[tamanho];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza um valor " + i);
            arr[i] = in.nextInt();
        }

        int maior = 0;
        boolean hasPar = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                hasPar = true;
                if(arr[i] > maior){
                    maior = arr[i];
                }
            }
        }

        if(hasPar){
            System.out.println("Maior: " + maior);
        } else {
            System.out.println("Nao tem par.");
        }
    }
}
