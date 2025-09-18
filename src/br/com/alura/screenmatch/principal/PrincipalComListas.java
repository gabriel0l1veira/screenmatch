package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDeGabriel = new Filme("Harry Potter", 2001);
        filmeDeGabriel.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDeGabriel;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDeGabriel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Sofi Turner");
        buscaArtista.add("Emma Stone");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaArtista);
        System.out.println("Lista de titulos ordenados ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
