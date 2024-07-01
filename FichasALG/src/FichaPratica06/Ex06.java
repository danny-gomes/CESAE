package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;
import static FichaPratica06.Ex05.*;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        System.out.println("Introduza o tamanho do vetor.");
        int tamanho = in.nextInt();
        int[] arr = new int[tamanho];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Introduza valor posicao " + i);
            arr[i] = in.nextInt();
        }

        do {
            System.out.println("7 - Maior Elemento.");
            System.out.println("8 - Menor Elemento.");
            System.out.println("9 - Crescente ou nao Crescente.");
            System.out.println("0 - Sair.");
            opcao = in.nextInt();
            switch (opcao) {
                case 7:
                    System.out.println("Maior elemento: " + maiorValorArray(arr));
                    break;
                case 8:
                    System.out.println("Menor elemento: " + menorValorArray(arr));
                    break;
                case 9:
                    if(checkCrescente(arr)){
                        System.out.println("Crescente.");
                    } else {
                        System.out.println("Nao Crescente.");
                    }
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
            System.out.println("\n");
        } while (opcao != 0);
    }
}
