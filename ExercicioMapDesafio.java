package br.com.dio.collections.list;

import java.util.*;

public class ExercicioMapDesafio {
    public static void main(String[] args) {
        List<Integer> ladosDados = new ArrayList<>(Arrays.asList(1, 2 , 3, 4, 5, 6));

        Random aleatorio = new Random();

        Map<Integer, Integer> listarDados = new TreeMap<>(){{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        for(int i = 0; i < 100; i++) {

            Integer valor = ladosDados.get(aleatorio.nextInt(ladosDados.size()));
            listarDados.put(valor, listarDados.get(valor) + 1);
        }

        System.out.println(listarDados);
    }
}
