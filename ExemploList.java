package br.com.dio.collections.list;
import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
//        Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça;

//        List<Double> notas = new ArrayList<>();
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8,5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0  está na lista: " + notas.contains(5d));

//        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
//        for (Double nota: notas) {
//            System.out.println(nota);
//        }
        System.out.println("Exiba a terceira nota seleciona: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma de todos os valores: ");
//        Double contador = 0.0;
//        for (Double nota: notas) {
//            contador += nota;
//        }
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println("Exiba a media entre as notas: " + (soma/notas.size()));

        System.out.println("Remova a nota zero");

        notas.remove(0.0);

        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");

        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> lista = notas.iterator();
        while(lista.hasNext()) {
            Double next = lista.next();
            if (next < 7.0) {
                lista.remove();
            }
        }

        System.out.println(notas);

        System.out.println("Apague toda a lista");

        notas.clear();

        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

//        Com LinkedList

        System.out.println("Crie uma lista chamada nota2 e coloque todos os elementos da lista ArrayList nessa nova lista");
        List<Double> notas2 = new LinkedList<Double>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2);
    }
}
