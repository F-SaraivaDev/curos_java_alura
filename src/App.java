import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class App {
    public static void main(String[] args) throws Exception {

        //Titulo favorito = new Titulo();

        Filme meuFilme = new Filme();
        
        meuFilme.setNome("Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);

        System.out.println("Duração do filme " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirAFichaTecnica();
        meuFilme.avaliar(9);
        meuFilme.avaliar(8);
        meuFilme.avaliar(9);

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

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
    }
}
