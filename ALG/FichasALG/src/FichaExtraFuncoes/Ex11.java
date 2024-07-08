package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] jogo = new String[3][3];
        int[] posicoes = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int jogadaJogador1, jogadaJogador2;
        String carJogador1 = "X";
        String carJogador2 = "O";

        int count = 1;
        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo[0].length; j++) {
                jogo[i][j] = Integer.toString(count);
                count++;
            }
        }

        System.out.println("***** JOGO DO GALO *****\n\n");

        boolean vencedor = false;
        String mensagemVencedor = "";

        for (int i = 0; i < 9; i++) {
            imprimirJogo(jogo);
            System.out.println();

            if (i % 2 == 0) {
                System.out.println("\nJogador 1 (X), introduza o numero em que quer jogar:");
                jogadaJogador1 = in.nextInt();
                while (!jogada(jogo, jogadaJogador1, posicoes, carJogador1)) {
                    System.out.println("Jogada invalida, tenta outra vez.");
                    jogadaJogador1 = in.nextInt();
                }

                vencedor = verificarVencedor(jogo);
                if(vencedor) {
                    mensagemVencedor = "JOGADOR 1 GANHOU!";
                    break;
                }
            } else {
                System.out.println("\nJogador 2 (O), introduza o numero em que quer jogar:");
                jogadaJogador2 = in.nextInt();
                while (!jogada(jogo, jogadaJogador2, posicoes, carJogador2)) {
                    System.out.println("Jogada invalida, tenta outra vez.");
                    jogadaJogador2 = in.nextInt();
                }

                vencedor = verificarVencedor(jogo);
                if(vencedor) {
                    mensagemVencedor = "JOGADOR 2 GANHOU!";
                    break;
                }
            }


        }

        if (vencedor) {
            System.out.println(mensagemVencedor);
            imprimirJogo(jogo);
        } else {
            System.out.println("EMPATE");
            imprimirJogo(jogo);
        }

    }

    private static boolean verificarVencedor(String[][] jogo) {
        // Verificar vencedor horizontalmente.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (jogo[i][j].equals(jogo[i][j + 1])) {
                    if (j == 1) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }

        // Verificar vencedor verticalemente
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (jogo[j][i].equals(jogo[j + 1][i])) {
                    if (j == 1) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }


        // Verificar vencedor diagonais
        if (jogo[0][0].equals(jogo[1][1]) && jogo[0][0].equals(jogo[2][2])) {
            return true;
        }

        if (jogo[0][2].equals(jogo[1][1]) && jogo[0][2].equals(jogo[2][0])) {
            return true;
        }

        return false;
    }

    private static boolean jogada(String[][] jogo, int jogadaJogador, int[] posicoes, String carJogador) {
        if (posicoes[jogadaJogador - 1] == 0) {
            System.out.println("Posicao ja preenchida.");
            return false;
        } else {
            if (jogadaJogador < 4) {
                jogo[0][jogadaJogador - 1] = carJogador;
                posicoes[jogadaJogador - 1] = 0;
            } else if (jogadaJogador < 7) {
                jogo[1][jogadaJogador - 4] = carJogador;
                posicoes[jogadaJogador - 1] = 0;
            } else if (jogadaJogador < 10) {
                jogo[2][jogadaJogador - 7] = carJogador;
                posicoes[jogadaJogador - 1] = 0;
            } else {
                System.out.println("Jogada Invalida.");
                return false;
            }
        }

        return true;
    }

    private static String imprimirJogo(String[][] jogo) {
        String jogoImprimido = "";
        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo[0].length; j++) {

                if (j == 2) {
                    System.out.print(jogo[i][j]);
                } else {
                    System.out.print(jogo[i][j] + "\t|\t");
                }


            }
            if (!(i == jogo.length - 1)) {
                System.out.print("\n-------------------\n");
            }
        }

        return jogoImprimido;
    }
}
