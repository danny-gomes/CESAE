package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex02 {
    public static void main(String[] args) {
        try{
            File file = new File("Dados/ex02.txt");
            boolean isNovoFicheiro = file.createNewFile();
            PrintWriter pw = new PrintWriter(file);

            for(int i = 0; i <= 200; i++){
                pw.println(i);
            }

            pw.close();

            if(isNovoFicheiro){
                System.out.println("Ficheiro criado com sucesso.");
            } else {
                System.out.println("Ficheiro alterado.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro nao encontrado.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("Erro I/O.");
            throw new RuntimeException(e);
        }
    }
}
