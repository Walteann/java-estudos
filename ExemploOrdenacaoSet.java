package br.com.dio.collections.list;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\t Ordem aletória \t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("Got", "Fantasia", 60));
           add(new Serie("The big Bang Theory", "Comedia", 25));
           add(new Serie("Break Bad", "Drama", 60));
        }};

        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem inserção \t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("The big Bang Theory", "Comedia", 25));
            add(new Serie("Break Bad", "Drama", 60));
        }};

        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Ordem natural (tempoEpisodio) \t--");

        Set<Serie> minhasSeries3 = new TreeSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("The big Bang Theory", "Comedia", 25));
            add(new Serie("Break Bad", "Drama", 60));
        }};

        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\t Orem Nome/Genero/TempoEpisodio");

        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries2);

        for (Serie serie: minhasSeries4) {
            System.out.println(serie.getNome() + " - "+ serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public Integer getTempoEpisodio() {
        return this.tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempo = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        int genero = this.getGenero().compareTo(serie.getGenero());
        int nome = this.getNome().compareTo(serie.getNome());

        if (tempo != 0) return tempo;
        if (genero != 0) return genero;
        return nome;
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie1.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());


    }
}