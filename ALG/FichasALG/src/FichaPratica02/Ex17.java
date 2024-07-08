package FichaPratica02;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int saldoMedio;
        double credito = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o saldo medio.");
        saldoMedio = in.nextInt();

        if(saldoMedio <= 2000){
            System.out.println("Nenhum credito.");
        } else if(saldoMedio <= 4000) {
            credito = saldoMedio * 0.2;
        } else if(saldoMedio <= 6000){
            credito = saldoMedio * 0.3;
        } else {
            credito = saldoMedio * 0.4;
        }

        System.out.println("Saldo Medio: " + saldoMedio + "\nCredito: " + credito);
    }
}
