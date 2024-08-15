package FichaPratica11.Ex01;

public class Aviao {
    private String numeroSerie;
    private String modelo;
    private int anoFabrico;
    private double pesoKg;
    private double comprimentoFusM;
    private double envergaduraAsasM;
    private double alturaCaudaM;
    private int numMotores;
    private int autonomiaKm;
    private int velMaxKmH;
    private double preco;

    public Aviao() {
    }

    public Aviao(String numeroSerie, String modelo, int anoFabrico, double pesoKg, double comprimentoFusM, double envergaduraAsasM, double alturaCaudaM, int numMotores, int autonomiaKm, int velMaxKmH, double preco) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.pesoKg = pesoKg;
        this.comprimentoFusM = comprimentoFusM;
        this.envergaduraAsasM = envergaduraAsasM;
        this.alturaCaudaM = alturaCaudaM;
        this.numMotores = numMotores;
        this.autonomiaKm = autonomiaKm;
        this.velMaxKmH = velMaxKmH;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes(){
        System.out.println("NUMERO SERIE: " + this.numeroSerie);
        System.out.println("MODELO: " + this.modelo);
    }
}
