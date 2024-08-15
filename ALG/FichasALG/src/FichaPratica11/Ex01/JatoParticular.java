package FichaPratica11.Ex01;

import java.util.ArrayList;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capacidadeBagaemCm3;
    private Categoria categoria;
    private ArrayList<String> instalcoes;

    public JatoParticular(String numeroSerie, String modelo, int anoFabrico, double pesoKg, double comprimentoFusM, double envergaduraAsasM, double alturaCaudaM, int numMotores, int autonomiaKm, int velMaxKmH, int lotacao, double capacidadeBagaemCm3, Categoria categoria, double preco) {
        super(numeroSerie, modelo, anoFabrico, pesoKg, comprimentoFusM, envergaduraAsasM, alturaCaudaM, numMotores, autonomiaKm, velMaxKmH, preco);
        this.lotacao = lotacao;
        this.capacidadeBagaemCm3 = capacidadeBagaemCm3;
        this.categoria = categoria;
        this.instalcoes = new ArrayList<>();
    }

    public void addInstalcao(String instalcao) {
        this.instalcoes.add(instalcao);
    }

    public void removeInstalcao(String instalcao) {
        if (this.instalcoes.remove(instalcao)) {
            System.out.println("Instalcao removida.");
        } else {
            System.out.println("Instalacao nao encontrada.");
        }
    }

    public void exibirInstalcoes() {
        System.out.println("INSTALACOES: ");
        for (String instalcao : this.instalcoes) {
            System.out.println(instalcao);
        }
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("LOTACAO: " + this.lotacao);
        System.out.println("BAGAGEM: " + this.capacidadeBagaemCm3);
        System.out.println("CATEGORIA: " + this.categoria);
        exibirInstalcoes();
    }
}
