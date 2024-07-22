package FichaPratica11.Ex02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Carro{

    public Mota(String marca, String modelo, int anoFabrio, int potencia, int cilindrada, TipoCombustivel combustivel, int litros100km, int qtdPassageiros) {
        super(marca, modelo, anoFabrio, potencia, cilindrada, combustivel, litros100km, qtdPassageiros);
    }

    public void imprmirMota(String path){
        try{
            Scanner lerFicheiro = new Scanner(new File(path));

            while(lerFicheiro.hasNextLine()){
                System.out.println(lerFicheiro.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
