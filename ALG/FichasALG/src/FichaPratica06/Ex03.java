package FichaPratica06;

public class Ex03 {
    public static boolean checkTriangular(int num) {
        int count = 0;
        int soma = 0;
        while(soma < num){
            soma = soma + count;
            count++;
        }
        if(soma == num){
            return true;
        }

        return false;
    }

    public static boolean checkPerfeito(int num) {
        int somaDiv = 0;
        for(int i = num / 2; i > 0; i--){
            if(num % i == 0){
                somaDiv = somaDiv + i;
            }
        }

        if(somaDiv == num){
            return true;
        }

        return false;
    }

    public static boolean checkPrimo(int num) {
        boolean isPrimo = true;
        for (int i = num / 2; i > 1; i--) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo && num != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSinal(int num) {
        return num >= 0;
    }

    public static boolean checkParidade(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
