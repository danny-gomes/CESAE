package FichaPratica10.Ex01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void exibirDetalhes() {
        System.out.print("Titulo: " + this.titulo + "\t|\t");
        System.out.print("Genero: " + this.genero + "\t|\t");
        System.out.print("Artista: " + this.artista + "\t|\t");
        System.out.print("Duracao: " + this.duracao + "\t|\t\n");
        System.out.println("---------------------------");
    }
}
