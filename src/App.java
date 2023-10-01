import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
//import br.com.alura.screenmatch.modelos.Titulo;

public class App {
    public static void main(String[] args) throws Exception {

        //Titulo titulo = new Titulo();

        Filme meuFilme = new Filme();
        
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);

        System.out.println("Duração do filme " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirAFichaTecnica();
        meuFilme.avaliar(1);
        meuFilme.avaliar(3);
        meuFilme.avaliar(1);

        System.out.println("Média de avaliações do filme: " + meuFilme.pegarMedia());

        Serie silo = new Serie();

        silo.setNome("Silo");
        silo.setAnoDeLancamento(2023);
        silo.exibirAFichaTecnica();
        silo.setMinutosPorEpisodio(50);
        silo.setTemporadas(10);
        silo.setEpisodiosPorTemporada(10);
       
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        System.out.println("Duração para maratonar Silo: " + silo.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Rambo III");
        outroFilme.setAnoDeLancamento(1991);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.avaliar(10);
        outroFilme.avaliar(9);
        outroFilme.avaliar(10);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(silo);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(outroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNome("Silo");
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeTerror = new Filme();
        filmeTerror.setNome("Exorcista");
        filmeTerror.setDuracaoEmMinutos(200);
        filmeTerror.setAnoDeLancamento(1970);
        filmeTerror.avaliar(10);

        ArrayList<Filme>listaFilmes = new ArrayList<>();
        listaFilmes.add(filmeTerror);
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);

        //Parou na aula 01.Coleção de filmes - aula Entendendo a hierarquia de classes e métodos

    }
}
