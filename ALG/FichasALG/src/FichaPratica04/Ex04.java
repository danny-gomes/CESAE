import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Introduza um numero.");
        num = in.nextInt();
        boolean isPrimo = true;

        for (int i = num / 2; i > 1; i--) {
            if (num % i == 0) {
                isPrimo = false;
                break;
            }
        }
        if (isPrimo && num != 0) {
            System.out.println("O numero e primo");
        } else {
            System.out.println("Nao e primo.");
        }
    }
}
