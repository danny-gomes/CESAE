package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) throws FileNotFoundException {
        File ficheiroEventos = new File("Dados/ex11.csv");
        Scanner in = new Scanner(ficheiroEventos);
        Scanner inConsola = new Scanner(System.in);
        System.out.println("Introduza o mes para verificar eventos.");
        String mesEventos = inConsola.next();
        boolean encontradoEvento = false;

        in.nextLine();

        while(in.hasNextLine()){
            String linha = in.nextLine();
            String[] conteudoLinha = linha.split(",");

            String evento = conteudoLinha[0];
            String dia = conteudoLinha[1];
            String mes = conteudoLinha[2];
            String ano = conteudoLinha[3];
            String lotacao = conteudoLinha[4];

            if(mes.equalsIgnoreCase(mesEventos)){
                encontradoEvento = true;
                System.out.println(evento);
                System.out.println("\t" + dia + " de " + mes + " " + ano);
                System.out.println("\tLotacao: " + lotacao);
            }

        }

        if(!encontradoEvento){
            System.out.println("Nao foram encontrados eventos para esse mes.");
        }
    }
}
