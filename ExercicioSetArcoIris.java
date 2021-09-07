package br.com.dio.collections.list;

import java.util.*;

public class ExercicioSetArcoIris {
    public static void main(String[] args) {

        Set<String> arcoIris = new TreeSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        System.out.println("Exiba todas as cores uma abaixo da outra");
        Iterator<String> iterator1 = arcoIris.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("A quantidade de cores que tem: " + arcoIris.size());

        System.out.println("Exibir as cores que começa com v");

        Iterator<String> iterator2 = arcoIris.iterator();

        while (iterator2.hasNext()) {
            String next = iterator2.next();
            if (next.startsWith("v")) {
                System.out.println(next);
            } else  {
                iterator2.remove();
            }
        }

        System.out.println("Remover todas as cores que não começa com a letra v");
        System.out.println(arcoIris);

        System.out.println("Limpe o conjunto");
        arcoIris.clear();
        System.out.println(arcoIris);

        System.out.println("O Conjuto estar vazio? " + arcoIris.isEmpty());


    }
}
