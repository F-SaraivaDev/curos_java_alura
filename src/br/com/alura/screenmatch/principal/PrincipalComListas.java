package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Matrix", 1999);
        meuFilme.avaliar(10);
        Serie silo = new Serie("Silo", 2023);
        silo.avaliar(9);
        var outroFilme = new Filme("Rambo III", 1991);
        outroFilme.avaliar(7);
        Filme filmeTerror = new Filme("Jurassic Park", 1993);
        filmeTerror.avaliar(4);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeTerror);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(silo);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        ArrayList<String>buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Sylvester Stalone");
        buscaPorArtista.add("Bruce Willians");
        buscaPorArtista.add("Fernanda Montenegro");
        System.out.println(buscaPorArtista);
        System.out.println("-------------------------------------------------------------");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
