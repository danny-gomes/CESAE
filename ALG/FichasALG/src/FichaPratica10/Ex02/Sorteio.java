package FichaPratica10.Ex02;

import java.util.ArrayList;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> pessoas;

    public Sorteio(double premio) {
        this.premio = premio;
        pessoas = new ArrayList<>();
    }

    public void addPessoa(Pessoa p){
        if(p.getIdade() < 18){
            System.out.println("Menor de idade, vai embora.");
        } else {
            pessoas.add(p);
        }
    }

    public Pessoa sortear(){
        int participantes = pessoas.size();
        int sorteado = (int) Math.floor((Math.random() * participantes));

        return pessoas.get(sorteado);
    }

    public void imprimirListaParticipantes(){
        for(int i = 0; i < pessoas.size(); i++){
            System.out.print("Participante " + (i+1) + ": ");
            pessoas.get(i).exibirDetalhes();
        }
    }

}
