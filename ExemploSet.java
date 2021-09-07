package br.com.dio.collections.list;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0  está na lista: " + notas.contains(5d));

//        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma de todos os valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);
//
        System.out.println("Exiba a media entre as notas: " + soma/notas.size());

        System.out.println("Remova a nota zero");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double nota = iterator2.next();

            if (nota < 7.0) {
                iterator2.remove();
            }
        }
        System.out.println(notas);
//
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);
//
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        System.out.println("Imprima de acordo com a ordem natural");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas3);

//
//        System.out.println("Crie uma lista chamada nota2 e coloque todos os elementos da lista ArrayList nessa nova lista");
//
//        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
//        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");

    }
}
