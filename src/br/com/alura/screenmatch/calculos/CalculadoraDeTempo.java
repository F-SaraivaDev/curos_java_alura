package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

//import br.com.alura.screenmatch.modelos.Filme;
//import br.com.alura.screenmatch.modelos.Serie;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal(){
        return tempoTotal;
    }
    
    /* 
    public void inclui(Filme filme){
        this.tempoTotal += filme.getDuracaoEmMinutos();
    }

    public void inclui(Serie serie){
        this.tempoTotal += serie.getDuracaoEmMinutos();
    }
    */

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
