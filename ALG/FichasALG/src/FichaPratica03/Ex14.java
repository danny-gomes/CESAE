package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAtual, numAnt, qtdNums;
        boolean isCrescente = true;

        System.out.println("Quantos numeros quer inserir?");
        qtdNums = in.nextInt();
        System.out.println("Introduza um numero");
        numAnt = in.nextInt();

        for(int i = 0; i < qtdNums - 1; i++){
            System.out.println("Outro.");
            numAtual = in.nextInt();
            if(numAtual < numAnt){
                isCrescente = false;
            }
            numAnt = numAtual;
        }

        if(isCrescente){
            System.out.println("Crescente");
        } else {
            System.out.println("Nao Cresecente");
        }
    }
}
