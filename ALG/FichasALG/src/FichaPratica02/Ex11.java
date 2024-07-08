package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int saldoAtual, movimento;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduza o seu saldo atual.");
        saldoAtual = in.nextInt();

        System.out.println("Introduza o movimento.");
        movimento = in.nextInt();

        if(saldoAtual + movimento < 0){
            System.out.println("Saldo insuficiente.");
        } else {
            saldoAtual = saldoAtual + movimento;
            System.out.println("Saldo Atual: " + saldoAtual);
        }
    }
}
