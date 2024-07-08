package FichaExtraFuncoes;

import java.util.Scanner;


public class Ex10 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual a forma do terreno ?");
        String forma = in.next();

        double area = calcularArea(forma);

        System.out.println("Qual o preco do terreno ?");
        double preco = in.nextDouble();
        System.out.println("Qual a tipologia ?");
        String tipologia = in.next();

        String valorMercado = checkPreco(area, preco, tipologia);

        System.out.println(valorMercado);
    }

    private static String checkPreco(double area, double preco, String tipologia) {
        double precoM2 = preco / area;
        switch (tipologia){
            case "urbano":
                if(precoM2 < 450){
                    return "Abaixo do valor de mercado, preco: " + precoM2 + "euro/m2";
                } else if(precoM2 > 750){
                    return "Acima valor mercado, preco: " + precoM2 + "euro/m2";
                }
            case "urbanizavel":
                if(precoM2 < 150){
                    return "Abaixo do valor de mercado, preco: " + precoM2 + "euro/m2";
                } else if(precoM2 > 500){
                    return "Acima valor mercado, preco: " + precoM2 + "euro/m2";
                }
            case "rustico":
                if(precoM2 < 30){
                    return "Abaixo do valor de mercado, preco: " + precoM2 + "euro/m2";
                } else if(precoM2 > 60){
                    return "Acima valor mercado, preco: " + precoM2 + "euro/m2";
                }
        }

        return "Dentro do valor de mercado, preco: " + precoM2 + "euro/m2";
    }

    private static double calcularArea(String forma) {
        switch (forma) {
            case "triangular":
                System.out.println("Introduza a base");
                int base = in.nextInt();
                System.out.println("Introduza a altura");
                int alturaTri = in.nextInt();
                return (base * alturaTri) / 2;
            case "quadrado":
                System.out.println("Introduza o lado");
                int lado = in.nextInt();
                return lado * lado;
            case "retangulo":
                System.out.println("Introduza a altura");
                int alturaRet = in.nextInt();
                System.out.println("Introduza largura");
                int largura = in.nextInt();
                return alturaRet * largura;
            case "circular":
                System.out.println("Introduza o raio");
                int raio = in.nextInt();
                return Math.PI * Math.pow(raio, 2);
            default:
                System.out.println("Forma invalida");
                return -1;
        }
    }
}
