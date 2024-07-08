package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] arr = new int[tamanho];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza um valor " + i);
            arr[i] = in.nextInt();
        }


        int soma = 0;
        for(int i = 0; i < arr.length; i++){
            soma = soma + arr[i];
        }

        double media = soma / arr.length;
        System.out.println("Media: " + media);
    }
}
