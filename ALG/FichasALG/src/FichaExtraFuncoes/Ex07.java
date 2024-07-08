package FichaExtraFuncoes;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println(inverterInteiro(12345678));
    }

    public static int inverterInteiro(int num) {
        int count = qtdDigitos(num) - 1;
        int numInvertido = 0;
        int ultimoDigito;

        while (num > 0) {
            ultimoDigito = num % 10;
            numInvertido = (int) (numInvertido + ultimoDigito * Math.pow(10, count));
            num = num / 10;
            count--;
        }

        return numInvertido;
    }

    private static int qtdDigitos(int num) {
        int qtd = 0;
        while(num > 0){
            num = num / 10;
            qtd++;
        }

        return qtd;
    }
}
