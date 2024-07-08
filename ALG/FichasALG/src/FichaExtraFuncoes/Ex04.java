package FichaExtraFuncoes;

public class Ex04 {
    public static void main(String[] args) {
        imprimirTabuada(7);
    }

    public static void imprimirTabuada(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
