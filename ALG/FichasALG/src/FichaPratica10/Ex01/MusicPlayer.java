package FichaPratica10.Ex01;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }

    public void addMusica(Musica m) {
        programacao.add(m);
    }

    public void trocarMusica(Musica trocar1, Musica trocar2) {
        int indiceMusica1 = programacao.indexOf(trocar1);
        int indiceMusica2 = programacao.indexOf(trocar2);

        programacao.remove(trocar1);
        programacao.remove(trocar2);
        programacao.add(indiceMusica2, trocar1);
        programacao.add(indiceMusica1, trocar2);
    }

    public void removerMusica(Musica m) {
        programacao.remove(m);
    }

    public void apagarTudo() {
        programacao.clear();
    }

    public String duracaoProgramacao() {
        int segundosTotais = 0;
        for (Musica m : programacao) {
            segundosTotais += m.getDuracao();
        }
        int horas, minutos, segundos;

        horas = segundosTotais / 3600;
        segundosTotais = segundosTotais % 3600;
        minutos = segundosTotais / 60;
        segundosTotais = segundosTotais % 60;
        segundos = segundosTotais;

        return horas + " : " + minutos + " : " + segundos;
    }

    public void exibirProgramacao() {
        System.out.println("***** PROGRAMACAO *****\n");
        for (int i = 0; i < programacao.size(); i++) {
            System.out.println("MUSICA " + (i + 1) + "\n");
            programacao.get(i).exibirDetalhes();
        }
    }
}
