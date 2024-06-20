package FichaExtraCiclos;

public class Ex04 {
    public static void main(String[] args) {
        String car = "*";
        int linhasImprimirBloco = 30;
        int linhasImprimirEscada = 20;
        int baseArvore = 10;

        System.out.println("4.1");
        for (int i = 1; i <= linhasImprimirBloco; i++) {
            System.out.print(car);
            if (i % 10 == 0) {
                System.out.print("\n");
            }
        }

        System.out.println("\n4.2");

        for (int i = 0; i < linhasImprimirEscada; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(car);
            }
            System.out.print("\n");
        }

        System.out.println("\n4.3");

        int pontoAoMeio = baseArvore / 2;

        for (int i = 0; i < baseArvore; i++) {
            for (int j = 0; j < baseArvore; j++) {
                if(j == pontoAoMeio - i){
                    for(int z = 0; z < (i*2 + 1); z++){
                        System.out.print(car);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            /*
                j = 1;         4 x
                j= 3;        3 4 5 x
                j= 5;      2 3 4 5 6 x
                j = 7;   1 2 3 4 5 6 7 x
                j = 9; 0 1 2 3 4 5 6 7 8
            */

        }
    }
}
