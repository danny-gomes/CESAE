package FichaPratica01;

import java.util.Scanner;

public class Ex09 {
    public Ex09() {
    }

    public static void main(String[] args) {
        int venBase = 40;
        int subAlimentacaoBase = 5;
        double retIRS = 0.1;
        double segSocialFun = 0.11;
        double segSocialPat = 0.2375;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduza o seu codigo de funcionario.");
        String codFuncionario = in.next();
        System.out.println("Introduza os dias trabalhados.");
        int diasTrabalho = in.nextInt();
        double salIliquido = (double) (diasTrabalho * venBase);
        System.out.println("Salario Iliquido: " + salIliquido + "€");
        double subAliTotal = (double) (subAlimentacaoBase * diasTrabalho);
        System.out.println("Subsidio Alimentacao: " + subAliTotal + "€");
        double retencaoIRS = salIliquido * retIRS;
        System.out.println("Retencao IRS: " + retencaoIRS + "€");
        double valorSegSocialFun = salIliquido * segSocialFun;
        double valorSegSocialPat = salIliquido * segSocialPat;
        double segSocialTotal = valorSegSocialPat + valorSegSocialFun;
        System.out.println("Valor Seguranca Social Ambos: " + segSocialTotal + "€");
        double salLiquido = salIliquido - retencaoIRS - valorSegSocialFun;
        System.out.println("Salario Liquido: " + salLiquido + "€");
    }
}
