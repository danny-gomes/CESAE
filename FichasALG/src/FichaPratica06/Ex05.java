package FichaPratica06;

public class Ex05 {
    public static int maiorValorArray(int[] vet) {
        int maior = vet[0];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        return maior;
    }

    public static int menorValorArray(int[] vet) {
        int menor = vet[0];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }

        return menor;
    }

    public static boolean checkCrescente(int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
