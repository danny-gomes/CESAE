package FichaPratica06;

public class Ex08 {
    public static void main(String[] args) {
        int[][] mat1 = {{1,1,1}, {2,2,2},{3,3,3}};
        int[][] mat2 = {{1,1,1}, {2,2,2},{3,3,3}};

        somarMatrizes(mat1, mat2);
        System.out.println("Somatorio matrizes: " + somatorioMatrizes(mat1, mat2));
    }

    public static void somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] matrizResultado = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        imprimirMatriz(matrizResultado);
    }

    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {
        int soma = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                soma = soma + matriz1[i][j] + matriz2[i][j];
            }
        }

        return soma;
    }

    public static void imprimirMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

}
