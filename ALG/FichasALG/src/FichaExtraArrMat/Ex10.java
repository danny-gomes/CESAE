package FichaExtraArrMat;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("REMOVER VALORES DUPLICADOS");
        Scanner in = new Scanner(System.in);
        int tamanho = 10;
        int[] arr = new int[tamanho];
        int[] primOcorrencia = new int[tamanho];
        int primOcorrCount = 0;

        for(int i = 0; i < tamanho; i++){
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }



        int numPesquisar;

        for(int i = 0; i < tamanho; i++){
            numPesquisar = arr[i];
            boolean found = false;
            for(int j = 0; j < tamanho; j++){
                if(primOcorrencia[j] == numPesquisar){
                    found = true;
                    break;
                }
            }
            if (!found){
                primOcorrencia[primOcorrCount] = numPesquisar;
                primOcorrCount++;
            }
        }


        for(int i = 0; i < primOcorrCount; i++){
            System.out.print(primOcorrencia[i] + " ");
        }
    }
}
