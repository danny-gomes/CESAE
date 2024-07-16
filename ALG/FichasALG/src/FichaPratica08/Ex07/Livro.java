package FichaPratica08.Ex07;

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String ISBN;

    public Livro(String titulo, String autor, String categoria, int numPaginas, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    public void exibirDetalhes(){
        System.out.println("TITULO: " + this.titulo);
        System.out.println("AUTOR: " + this.autor);
        System.out.println("CATEGORIA: " + this.categoria);
        System.out.println("NUMERO DE PAGINAS: " + this.numPaginas);
        System.out.println("ISBN: " + this.ISBN);
    }
}
