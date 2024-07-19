package FichaPratica10.Ex01;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        Musica song1 = new Musica("Bohemian Rhapsody", "Rock", "Queen", 354);
        mp.addMusica(song1);

        Musica song2 = new Musica("Imagine", "Pop", "John Lennon", 183);
        mp.addMusica(song2);

        Musica song3 = new Musica("Smells Like Teen Spirit", "Grunge", "Nirvana", 301);
        mp.addMusica(song3);

        Musica song4 = new Musica("Hotel California", "Rock", "Eagles", 390);
        mp.addMusica(song4);
        Musica song5 = new Musica("Thriller", "Pop", "Michael Jackson", 358);
        mp.addMusica(song5);

        Musica song6 = new Musica("Shape of You", "Pop", "Ed Sheeran", 263);
        mp.addMusica(song6);

        Musica song7 = new Musica("Rolling in the Deep", "Soul", "Adele", 228);
        mp.addMusica(song7);

        Musica song8 = new Musica("Stairway to Heaven", "Rock", "Led Zeppelin", 482);
        mp.addMusica(song8);

        Musica song9 = new Musica("Hey Jude", "Rock", "The Beatles", 431);
        mp.addMusica(song9);

        Musica song10 = new Musica("Lose Yourself", "Hip Hop", "Eminem", 326);
        mp.addMusica(song10);

        mp.exibirProgramacao();

        mp.trocarMusica(song10, song1);
        System.out.println("\n***** MUSICA TROCADA *****\n");
        mp.exibirProgramacao();
        mp.removerMusica(song3);
        System.out.println("\n***** MUSICA 3 REMOVIDA *****\n");
        mp.exibirProgramacao();
        String duracao = mp.duracaoProgramacao();
        System.out.println("DURACAO TOTAL: " + duracao);
        mp.apagarTudo();
        System.out.println("\n***** DURACAO DEPOIS REMOVER TUDO *****\n");
        duracao = mp.duracaoProgramacao();
        System.out.println("DURACAO TOTAL: " + duracao);

    }

}
