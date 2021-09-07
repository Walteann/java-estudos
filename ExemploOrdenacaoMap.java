package br.com.dio.collections.list;

import java.util.*;

public class ExemploOrdenacaoMap {
    /* Dados os seguintes informacoes sobre meus livros favoritos e seus autores crie um dicionário e
    ordene este dicionário: exibindo( Nome Autor - Nome Livro)
    * Autor = Hawking, Stephen - Livro = nome: Uma breve Historia do tempo. páginas: 256
    * Autor = Duhigg, Charles - Livro = nome: O poder do hábito. páginas: 408
    * Autor = Harari, Yuval Noah - Livro = nome: 21 Liçoes para o seculo 21. páginas: 432
    * */

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve Historia do tempo.", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito. páginas.", 408));
            put("Harari, Yuval Noah", new Livro("21 Liçoes para o seculo 21.", 432));
        }};

        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve Historia do tempo.", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito. páginas.", 408));
            put("Harari, Yuval Noah", new Livro("21 Liçoes para o seculo 21.", 432));
        }};

        for(Map.Entry<String, Livro> livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabétoca autores\t--");

        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);

        for(Map.Entry<String, Livro> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for(Map.Entry<String, Livro> livro: meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem pelo numero de páginas\t--");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());

        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getPaginas() {
        return this.paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
    }
}