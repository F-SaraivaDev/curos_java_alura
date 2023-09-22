public class App {
    public static void main(String[] args) throws Exception {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibirAFichaTecnica();

        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDasAvaliacoes());
       
    }
}
