package FichaPratica09.Ex04;

public class Main {
    public static void main(String[] args) {
        Imovel i1 = new Imovel("Rua rua rua", "82","Baiao", Imovel.Tipo.APARTAMENTO, Imovel.Acabamento.RESTAURO,300,2,2,20);
        Imovel i2 = new Imovel("Rua aru aru", "28","Trofa", Imovel.Tipo.APARTAMENTO, Imovel.Acabamento.NOVA_COM_ACAMENTO,300,2,2,20);

        i1.exibirDetalhes();
        i2.exibirDetalhes();

        System.out.println("Mais caro:\n");
        i1.maisCaro(i2).exibirDetalhes();
    }
}
