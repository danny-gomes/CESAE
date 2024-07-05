package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        int colunas = 4;
        try {
            Scanner in = new Scanner(System.in);
            int linhas = lerLinhasFicheiro();
            System.out.println("xxxx");
            String[][] ficheiroMusicaMatriz = new String[linhas][colunas];
            lerFicheiro(ficheiroMusicaMatriz);

            int opcao;

            do {
                System.out.println("\nIntroduza uma opcao:");
                System.out.println("1 - Mostrar musicas determinado genero");
                System.out.println("2 - Mostrar musicas determinado artista");
                System.out.println("3 - Mostar musica com maior duracao");
                System.out.println("4 - Musicas acima de uma determinada duracao");
                System.out.println("5 - Numero de musicas no ficheiro");
                System.out.println("6 - Sair");

                opcao = in.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Introduza o genero a pesquisar");
                        in.nextLine();
                        String generoPesquisar = in.nextLine();
                        String[] musicasPorGenero = mostrarMusicaGenero(ficheiroMusicaMatriz, generoPesquisar);
                        if (musicasPorGenero.length == 0) {
                            System.out.println("Genero nao encontrado.");
                        } else {
                            System.out.println("Musicas do genero: " + generoPesquisar);
                            imprimirArray(musicasPorGenero);
                        }
                        break;
                    case 2:
                        System.out.println("Introduza o artista a pesquisar");
                        in.nextLine();
                        String artistaPesquisar = in.nextLine();
                        String[] musicasPorArtista = mostrarMusicaArtista(ficheiroMusicaMatriz, artistaPesquisar);
                        if (musicasPorArtista.length == 0) {
                            System.out.println("Artista nao encontrado.");
                        } else {
                            System.out.println("Musicas do artista: " + artistaPesquisar);
                            imprimirArray(musicasPorArtista);
                        }
                        break;
                    case 3:
                        String musica = getMusicaMaiorDuracao(ficheiroMusicaMatriz);
                        System.out.println("Musica maior: " + musica);
                        break;
                    case 4:
                        System.out.println("Introduza os minutos.");
                        int minutos = in.nextInt();
                        System.out.println("Introduza os segundos.");
                        int segundos = in.nextInt();
                        String[] musicasMaiorValor = getMusicaMaiorValor(ficheiroMusicaMatriz, minutos, segundos);
                        System.out.println("Musicas com valor acima de " + minutos + ":" + segundos);
                        imprimirArray(musicasMaiorValor);
                        break;
                    case 5:
                        System.out.println("Numero de musicas no ficheiro: " + ficheiroMusicaMatriz.length);
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                }
            } while (opcao != 6);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static String[] getMusicaMaiorValor(String[][] ficheiroMusicaMatriz, int minutos, int segundos) {
        int qtdMusicas = 0;


        for (int i = 0; i < ficheiroMusicaMatriz.length; i++) {
            String[] minutosSegundos = ficheiroMusicaMatriz[i][3].split(":");
            if (Integer.parseInt(minutosSegundos[0]) > minutos) {
                qtdMusicas++;

            } else if (Integer.parseInt(minutosSegundos[0]) == minutos) {
                if (Integer.parseInt(minutosSegundos[1]) > segundos) {
                    qtdMusicas++;
                }
            }
        }

        String[] musicas = new String[qtdMusicas];
        int musicasAdicionadas = 0;

        for (int i = 0; i < ficheiroMusicaMatriz.length; i++) {
            String[] minutosSegundos = ficheiroMusicaMatriz[i][3].split(":");
            if (Integer.parseInt(minutosSegundos[0]) > minutos) {
                musicas[musicasAdicionadas] = ficheiroMusicaMatriz[i][0];
                System.out.println(ficheiroMusicaMatriz[i][0] + " gggg ");
                musicasAdicionadas++;
            } else if (Integer.parseInt(minutosSegundos[0]) == minutos) {
                if (Integer.parseInt(minutosSegundos[1]) > segundos) {
                    musicas[musicasAdicionadas] = ficheiroMusicaMatriz[i][0];
                    musicasAdicionadas++;
                }
            }
        }

        return musicas;
    }

    private static String getMusicaMaiorDuracao(String[][] ficheiroMusicaMatriz) {
        int minutos = 0;
        int segundos = 0;
        String musicaMaior = "";

        for (int i = 0; i < ficheiroMusicaMatriz.length; i++) {
            String[] minutosSegundos = ficheiroMusicaMatriz[i][3].split(":");
            if (Integer.parseInt(minutosSegundos[0]) > minutos) {
                musicaMaior = ficheiroMusicaMatriz[i][0];
                minutos = Integer.parseInt(minutosSegundos[0]);
                segundos = Integer.parseInt(minutosSegundos[1]);

            } else if (Integer.parseInt(minutosSegundos[0]) == minutos) {
                if (Integer.parseInt(minutosSegundos[1]) > segundos) {
                    musicaMaior = ficheiroMusicaMatriz[i][0];
                    segundos = Integer.parseInt(minutosSegundos[1]);
                }
            }
        }

        return musicaMaior;
    }

    private static void imprimirArray(String[] musicas) {
        for (int i = 0; i < musicas.length; i++) {
            System.out.println(musicas[i]);
        }
    }

    private static String[] mostrarMusicaGenero(String[][] ficheiroMusicaMatriz, String generoPesquisar) {
        int countMusicasGenero = 0;
        for (int i = 0; i < ficheiroMusicaMatriz.length; i++) {
            if (generoPesquisar.equalsIgnoreCase(ficheiroMusicaMatriz[i][2])) {
                countMusicasGenero++;
            }
        }

        String[] musicasPorGenero = new String[countMusicasGenero];
        int countMusicasAdicionadas = 0;

        for (int i = 0; i < ficheiroMusicaMatriz.length; i++) {
            if (generoPesquisar.equalsIgnoreCase(ficheiroMusicaMatriz[i][2])) {
                musicasPorGenero[countMusicasAdicionadas] = ficheiroMusicaMatriz[i][0];
                countMusicasAdicionadas++;
            }
        }

        return musicasPorGenero;
    }

    private static String[] mostrarMusicaArtista(String[][] ficheiroMusicaMatriz, String artistaPesquisar) {
        int countMusicasArtista = 0;
        for (int i = 0; i < ficheiroMusicaMatriz.length; i++) {
            if (artistaPesquisar.equalsIgnoreCase(ficheiroMusicaMatriz[i][1])) {
                countMusicasArtista++;
            }
        }

        String[] musicasPorArtista = new String[countMusicasArtista];
        int countMusicasAdicionadas = 0;

        for (int i = 0; i < ficheiroMusicaMatriz.length; i++) {
            if (artistaPesquisar.equalsIgnoreCase(ficheiroMusicaMatriz[i][1])) {
                musicasPorArtista[countMusicasAdicionadas] = ficheiroMusicaMatriz[i][0];
                countMusicasAdicionadas++;
            }
        }

        return musicasPorArtista;
    }

    private static int lerLinhasFicheiro() throws FileNotFoundException {
        File ficheiroMusica = new File("Dados/ex09.csv");
        Scanner in = new Scanner(ficheiroMusica);
        int linhas = 0;

        in.nextLine();

        while (in.hasNextLine()) {
            linhas++;
            in.nextLine();
        }

        return linhas;
    }

    private static void lerFicheiro(String[][] ficheiroMusicaMatriz) throws FileNotFoundException {
        File ficheiroMusica = new File("Dados/ex09.csv");
        Scanner in = new Scanner(ficheiroMusica);

        in.nextLine();
        int countLinha = 0;

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] conteudoLinha = linha.split(",");
            ficheiroMusicaMatriz[countLinha][0] = conteudoLinha[0]; // nome
            ficheiroMusicaMatriz[countLinha][1] = conteudoLinha[1]; // artista
            ficheiroMusicaMatriz[countLinha][2] = conteudoLinha[2]; // genero
            ficheiroMusicaMatriz[countLinha][3] = conteudoLinha[3]; // duracao
            countLinha++;
        }

    }
}
