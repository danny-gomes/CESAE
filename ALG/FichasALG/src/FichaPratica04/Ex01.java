import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num1, num2, opcao;
      System.out.println("Introduza um numero.");
      num1 = in.nextInt();

      System.out.println("Outro");
      num2 = in.nextInt();

      String mensagem = "Escolha uma operacao\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5- Sair";
      do {
          System.out.println(mensagem);
          opcao = in.nextInt();

          switch (opcao){
              case 1:
                  System.out.println("Soma: " + num1 + num2);
                  break;
              case 2:
                  System.out.println("Subtracao: " + (num1 - num2));
                  break;
              case 3:
                  System.out.println("Multiplicacao: " + num1 * num2);
                  break;
              case 4:
                  System.out.println("Divisao: " + num1 / num2);
                  break;
              case 5:
                  break;
              default:
                  System.out.println("Opcao invalida.");
          }
      }while(opcao !=5);
    }
}
