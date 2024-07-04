package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        try {
            File portugalDatesFile = new File("Dados/ex01.txt");
            Scanner in = new Scanner(portugalDatesFile);
            String linha;

            while(in.hasNextLine()){
                linha = in.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
