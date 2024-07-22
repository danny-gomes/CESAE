package FichaPratica11.Ex01;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<String> armas;

    public AviaoCombate(String numeroSerie, String modelo, int anoFabrico, double pesoKg, double comprimentoFusM, double envergaduraAsasM, double alturaCaudaM, int numMotores, int autonomiaKm, int velMaxKmH, String paisOrigem, boolean camuflagem, double preco) {
        super(numeroSerie, modelo, anoFabrico, pesoKg, comprimentoFusM, envergaduraAsasM, alturaCaudaM, numMotores, autonomiaKm, velMaxKmH, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<>();
    }

    public void addArma(String arma) {
        if(this.armas.size() == 3){
            System.out.println("Armamento cheio.");
            return;
        }

        this.armas.add(arma);
        System.out.println("Arma adicionada.");
    }

    public void removeArma(String arma){
        if(this.armas.remove(arma)){
            System.out.println("Arma removida.");
        } else {
            System.out.println("Arma nao encontrada.");
        }
    }

    public void exibirArmas(){
        System.out.println("ARMAS: ");
        for(String arma : this.armas){
            System.out.println(arma);
        }
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("PAIS ORIGEM: " + this.paisOrigem);
        System.out.println("CAMUFLAGEM: " + (this.camuflagem ? "SIM" : "NAO"));
        exibirArmas();
    }

}
