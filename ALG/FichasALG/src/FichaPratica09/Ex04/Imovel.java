package FichaPratica09.Ex04;

public class Imovel {
    private String rua;
    private String porta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private double area;
    private int quartos;
    private int casasBanho;
    private double areaPisicna;

    public Imovel(String rua, String porta, String cidade, Tipo tipo, Acabamento acabamento, double area, int quartos, int casasBanho, double areaPisicna) {
        this.rua = rua;
        this.porta = porta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.quartos = quartos;
        this.casasBanho = casasBanho;
        this.areaPisicna = areaPisicna;
    }

    public double calcularValor() {
        double valor;
        if (this.tipo == Tipo.APARTAMENTO) {
            valor = this.area * 1000;
        } else if (this.tipo == Tipo.CASA) {
            valor = this.area * 3000;
        } else {
            valor = this.area * 5000;
        }

        if (this.acabamento == Acabamento.RESTAURO) {
            valor = valor * 0.5;
        } else if (this.acabamento == Acabamento.USADA) {
            valor = valor * 0.9;
        } else if (this.acabamento == Acabamento.NOVA_COM_ACAMENTO) {
            valor = valor * 1.25;
        }

        valor = valor + (this.quartos * 7500);
        valor = valor + (this.casasBanho * 10500);
        valor = valor + (this.areaPisicna * 1000);

        return valor;
    }

    public void mudarEstado(String estado) {
        if (estado.equalsIgnoreCase("restauro")) {
            this.acabamento = Acabamento.RESTAURO;
        }

        if (estado.equalsIgnoreCase("nova")) {
            this.acabamento = Acabamento.NOVA;
        }
        if (estado.equalsIgnoreCase("usada")) {
            this.acabamento = Acabamento.USADA;
        }
        if (estado.equalsIgnoreCase("nova com acabamento")) {
            this.acabamento = Acabamento.NOVA_COM_ACAMENTO;
        }
    }

    public Imovel maisCaro(Imovel outroImovel) {
        if (this.calcularValor() > outroImovel.calcularValor()) {
            return this;
        } else {
            return outroImovel;
        }
    }

    public void exibirDetalhes() {
        System.out.println("RUA: " + this.rua);
        System.out.println("NUMERO: " + this.porta);
        System.out.println("CIDADE: " + this.cidade);
        System.out.println("TIPO: " + this.tipo);
        System.out.println("ACABAMENTO: " + this.acabamento);
        System.out.println("AREA: " + this.area);
        System.out.println("NUMERO QUARTOS: " + this.quartos);
        System.out.println("NUMERO BANHOS: " + this.casasBanho);
        System.out.println("AREA PISCINA: " + this.areaPisicna);
        System.out.println();
    }

    public enum Tipo {
        APARTAMENTO, CASA, MANSAO
    }

    public enum Acabamento {
        RESTAURO, USADA, NOVA, NOVA_COM_ACAMENTO
    }
}


