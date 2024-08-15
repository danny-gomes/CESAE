package FichaPratica10.Ex03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marca;
    private ArrayList<Peixe> peixePescado;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixePescado = new ArrayList<>();
        this.mariscoPescado = new ArrayList<>();
    }

    public void pescarPeixe(Peixe p){
        double cargaTotal = 0;
        for(Peixe p1 : peixePescado) {
            cargaTotal += p1.getPeso();
        }

        for(Marisco m1 : mariscoPescado) {
            cargaTotal += m1.getPeso();
        }

        if(p.getPeso() + cargaTotal > this.capacidadeCarga){
            System.out.println("Muita carga, manda peixe para agua.");
        } else {
            this.peixePescado.add(p);
        }
    }

    public void pescarMarisco(Marisco m){
        double cargaTotal = 0;
        for(Marisco m1 : mariscoPescado) {
            cargaTotal += m1.getPeso();
        }

        for(Peixe p1 : peixePescado) {
            cargaTotal += p1.getPeso();
        }

        if(m.getPeso() + cargaTotal > this.capacidadeCarga){
            System.out.println("Muita carga, manda peixe para agua.");
        } else {
            this.mariscoPescado.add(m);
        }
    }

    public double calcularTotal(){
        double total = 0;

        for(Peixe p : peixePescado){
            total += p.getPrecoKg() * p.getPeso();
        }

        for(Marisco m : mariscoPescado){
            total += m.getPrecoKg() * m.getPeso();
        }

        return total;
    }

    public double salarioTripulacao(){
        double total = this.calcularTotal();
        total *= 0.6;

        return total / this.tripulacao;
    }

}
