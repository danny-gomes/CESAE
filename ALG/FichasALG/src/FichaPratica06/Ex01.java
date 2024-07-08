package FichaPratica06;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Que animal queres que faca barulho?");
        String animal = in.next();
        fazerBarulho(animal);
    }

    public static void fazerBarulho(String animal){
        switch (animal){
            case "Cao":
                System.out.println("Au au au");
                break;
            case "Gato":
                System.out.println("Miau miau miau");
            case "Peixe":
                System.out.println("Blu blu blu");
                break;
            case "Vaca":
                System.out.println("Muuuu");
                break;
            case "Porco":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("Esse animal nao existe :(");
        }
    }
}
