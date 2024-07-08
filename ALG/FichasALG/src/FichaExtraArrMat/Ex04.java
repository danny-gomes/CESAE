package FichaExtraArrMat;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("PESQUISAR VALOR ARRAY IMPRIMIR OCORRENCIAS");
        Scanner in = new Scanner(System.in);
        int tamanho = 10;
        int[] arr = new int[tamanho];
        int[] posicoesEncontradas = new int[tamanho];
        int encontrados = 0;

        for(int i = 0; i < tamanho; i++){
            System.out.println("Introduza um numero.");
            arr[i] = in.nextInt();
        }

        int numeroPesquisar;
        System.out.println("Introduza um numero a pesquisar");
        numeroPesquisar = in.nextInt();

        for(int i = 0; i < tamanho; i++){
            if(arr[i] == numeroPesquisar){
                posicoesEncontradas[encontrados] = i;
                encontrados++;
            }
        }

        if(encontrados > 0){
            System.out.println("Posicoes encontradas:\n");
            for(int i = 0; i < encontrados; i++){
                System.out.println(posicoesEncontradas[i]);
            }
        } else {
            System.out.println("Nao encontrado.");
        }
    }
}
