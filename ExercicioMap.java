package br.com.dio.collections.list;

import java.util.*;

public class ExercicioMap {
    /* Dada a população estimada de alguns estados do NE brasileiro, faça:
    Estado = PE - População = 9616621
    Estado = AL - População = 3351543
    Estado = CE - População = 9187103
    Estado = RN - População = 3534265
    * */

    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e suas populações");
        Map<String, Integer> estados = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};

        System.out.println(estados);

        System.out.println("Substitua a população do estado do RN por 3.534.165");

        estados.put("RN", 3534165);

        System.out.println(estados);

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        System.out.println("tem PB ? " + estados.containsKey("PB"));
        estados.put("PB", 4039277);

        System.out.println(estados);
        System.out.println("Exiba a população de PE : " + estados.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> estado1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(estado1);

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> estados2 = new TreeMap<>(estado1);

        System.out.println(estados2);

        System.out.println("Exiba o estado com o menor população e sua quantidade");

        Integer menorPopulacao = Collections.min(estados2.values());
        System.out.println(menorPopulacao);

        Set<Map.Entry<String, Integer>> estadosEntries = estados2.entrySet();
        String estadoMenosPopuloso = "";
        for (Map.Entry<String, Integer> entry: estadosEntries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenosPopuloso = entry.getKey();
            }
        }

        System.out.println(estadoMenosPopuloso);

        System.out.println("Exiba o estado com o maior população e sua quantidade");
        Integer maiorPopulacao = Collections.max(estados2.values());
        String estadoMaisPopuloso = "";
        for (Map.Entry<String, Integer> entry: estadosEntries) {
            if (entry.getValue().equals(maiorPopulacao)) {
                estadoMaisPopuloso = entry.getKey();
            }
        }

        System.out.println("Estado mais Populoso: " + estadoMaisPopuloso);

        Iterator<Integer> iterator = estados2.values().iterator();

        Integer soma = 0;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Exiba a soma da população desses estados:  " + soma);
        System.out.println("Remova os estados com população menor que 4.000.000");

        Iterator<Integer> iterator2 = estados2.values().iterator();

        while(iterator2.hasNext()) {
            if (iterator2.next() < 4000000) {
                iterator2.remove();
            }
        }

        System.out.println(estados2);

        System.out.println("Apague o dicionário de estados");
        estados2.clear();
        System.out.println(estados2);

        System.out.println("Verifique se o dicionario estar vazio: " + estados2.isEmpty());

    }
}
