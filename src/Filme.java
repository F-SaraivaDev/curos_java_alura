public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDasAvaliacoes(){
        return totalDasAvaliacoes;
    }

    void exibirAFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }
    
    double pegarMedia(){
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }
}
