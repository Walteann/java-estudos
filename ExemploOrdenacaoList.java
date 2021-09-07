package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        /*
        * Dadas as seguintes informações sobre seus gatos, crie uma lista e ordene esta lista exibindo:
        * (nome - idade - cor);
        *
        * Gato 1 = nome: Jon, idade: 18, cor: preto
        * Gato 2 = nome: Simba, idade: 6, cor: tigrado
        * Gato 3 = Jon, idade: 12, cor: amarelo
        * */

        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "trigado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};



        System.out.println("--\t Ordem de inserção \t--");
        System.out.println(meusGatos);
        System.out.println("--\t Ordem Aleatório \t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Natural \t--");

        Collections.sort(meusGatos);

        System.out.println("--\t Ordem por Idade \t--");
        Collections.sort(meusGatos, new ComparatorIdade());
//        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println("--\t Ordem por Cor \t--");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\t Ordem por nome/Cor/Idade \t--");

        meusGatos.sort(new ComparatorNomeCorIdade());


    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public String getCor() {
        return this.cor;
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

//    Alt + insert, escolher toString para imprimir parecido comum Obj.
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements  Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());

        if (nome != 0) {
            return nome;
        }

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());


    }
}