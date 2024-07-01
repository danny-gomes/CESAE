package FichaPratica06;

public class Ex07 {
    public static void main(String[] args) {
        quadrado("x", 4, 7);
    }

    public static void quadrado(String car, int linhas, int colunas){
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(i == 0 || i == linhas - 1){
                    System.out.print(car);
                } else {
                    if(j == 0 || j == colunas - 1) {
                        System.out.print(car);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
