package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int num;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza numero na posicao " + i);
            num = in.nextInt();
            arr[i] = num;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
