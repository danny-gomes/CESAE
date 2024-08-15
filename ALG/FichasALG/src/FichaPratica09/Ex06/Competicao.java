package FichaPratica09.Ex06;

import FichaPratica09.Ex05.Pessoa;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] atletas;
    private int numAtletas = 0;

    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public void addAtleta(Atleta a) {
        this.numAtletas++;
        Atleta[] atletasAux = new Atleta[this.numAtletas];

        if (this.atletas == null) {
            this.atletas = new Atleta[this.numAtletas];
            atletas[0] = a;
        } else {
            for (int i = 0; i < atletasAux.length; i++) {
                if( i == atletasAux.length - 1){
                    atletasAux[i] = a;
                } else {
                    atletasAux[i] = atletas[i];
                }
            }

            this.atletas = atletasAux;
        }
    }

    public void exibirDetalhes(){
        System.out.println("COMPETICAO: " + this.nome);
        System.out.println("PARTICIPANTES:");
        for(int i = 0; i < this.atletas.length; i++){
            System.out.println(atletas[i].getNome());
        }
        System.out.println("-------------------");
    }
}
