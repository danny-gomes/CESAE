package FichaExtraArrMat;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("VER ELEMENTOS COMUNS NOVO ARRAY");
        Scanner in = new Scanner(System.in);
        int tamanho = 8;
        int[] arr1 = new int[tamanho];
        int[] arr2 = new int[tamanho];
        int[] indiceOcorrencias = new int[tamanho];
        int[] ocorrenciasEncontradas = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Introduza um numero para array1.");
            arr1[i] = in.nextInt();
            System.out.println("Introduza um numero para array2.");
            arr2[i] = in.nextInt();
            indiceOcorrencias[i] = 0;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    indiceOcorrencias[i] = arr1[i];
                }
            }
        }

        int numOcorrencias = 0;
        int[] ocorrenciasAux = new int[tamanho];

        for (int i = 0; i < indiceOcorrencias.length; i++) {
            boolean jaAdicionado = false;
            for (int j = 0; j < ocorrenciasAux.length; j++) {
                if (indiceOcorrencias[i] == ocorrenciasAux[j]) {
                    jaAdicionado = true;
                    break;
                }
            }
            if (!jaAdicionado) {
                ocorrenciasAux[numOcorrencias] = indiceOcorrencias[i];
                numOcorrencias++;
            }
        }

        int[] ocorrenciasTamanhoCorreto = new int[numOcorrencias];

        for (int i = 0; i < numOcorrencias; i++) {
            ocorrenciasTamanhoCorreto[i] = ocorrenciasAux[i];
        }

        System.out.print("Array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


        System.out.print("\nArray 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\nElementos comuns: ");
        for (int i = 0; i < ocorrenciasTamanhoCorreto.length; i++) {
            System.out.print(ocorrenciasTamanhoCorreto[i] + " ");
        }
    }
}
