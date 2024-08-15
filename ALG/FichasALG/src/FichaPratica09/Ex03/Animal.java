package FichaPratica09.Ex03;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double pesoKg;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double pesoG) {
        for(int i = 0; i < this.alimentacao.length; i++){
            if(this.alimentacao[i].equalsIgnoreCase(alimento)) {
                this.pesoKg = this.pesoKg + (pesoG / 1000);
            }
        }
    }

    public void exibirDetalhes(){
        System.out.println("NOME: " + this.nome);
        System.out.println("ESPECIE: " + this.especie);
        System.out.println("PAIS ORIGEM: " + this.paisOrigem);
        System.out.println("PESO: " + this.pesoKg + " kG");
    }

}
