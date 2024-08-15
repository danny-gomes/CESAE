package FichaPratica11.Ex01;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogo;

    public void venderAviao(Aviao v) {
        int indice = catalogo.indexOf(v);

        if (indice == -1) {
            System.out.println("Aviao nao encontrado.");
            return;
        }

        this.catalogo.remove(indice);
        System.out.println("Aviao vendido.");
    }

    public void comprarAviao(Aviao v) {
        catalogo.add(v);
        System.out.println("Aviao comprado.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Aviao v : catalogo) {
            total += v.getPreco();
        }

        return total;
    }

    public void exibirCatalogo() {
        for (Aviao v : catalogo) {
            v.exibirDetalhes();
        }
    }
}
