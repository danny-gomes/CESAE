package FichaExtraFuncoes;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println(somatorio(361));
    }

    public static double somatorio(int num) {
        int soma = 0;

        while(num > 0){
            soma = soma + (num % 10);
            num = num / 10;
        }

        return soma;
    }
}
