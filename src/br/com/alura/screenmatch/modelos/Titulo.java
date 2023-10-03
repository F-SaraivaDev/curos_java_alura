package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibirAFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Incluído no plano: " + getIncluidoNoPlano());
    }
    
    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public int getTotalDasAvaliacoes(){
        return totalDasAvaliacoes;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos(){
        return this.duracaoEmMinutos;
    }

    public double pegarMedia(){
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

   
}
