import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAdivinhar, tentativa;
        int numTentativas = 0;

        System.out.println("Jogador 1 introduza numero.");
        numAdivinhar = in.nextInt();

        do{
            System.out.println("Jogador 2 adivinha");
            tentativa = in.nextInt();
            numTentativas++;
            if(tentativa < numAdivinhar){
                System.out.println("Mais alto.");
            } else {
                System.out.println("Mais baixo.");
            }
        }while(tentativa != numAdivinhar);

        System.out.println("Ganhou com " + numTentativas + " tentativas.");
    }
}
