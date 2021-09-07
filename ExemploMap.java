package br.com.dio.collections.list;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        /*
        * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
        *  modelo = gol - consumo= 14,4km/l
        *  modelo = uno - consumo= 15,6km/l
        *  modelo = mobi - consumo= 16,1km/l
        *  modelo = hb20 - consumo= 14,5km/l
        *  modelo = kwid - consumo= 15,6km/l
        * */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumo");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2km/l");

        carrosPopulares.put("gol", 15.2);

        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno") + "km/l");

//        System.out.println("Exiba o terceiro modelo adicionado");

        System.out.println("Exiba os modelos: ");

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {

            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
            }
        }

        System.out.println("Modelo Mais eficiente: " + modeloMaisEficiente);

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            soma += iterator.next();
//            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + soma / carrosPopulares.size());

        System.out.println("Remova os modelos com o consumo igual a 15.6km/l: ");

        Iterator<Double> iterador2 = carrosPopulares.values().iterator();
        while(iterador2.hasNext()) {
            if (iterador2.next().equals(15.6)) {
                iterador2.remove();
            }
        }

        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares2);

        System.out.println("Exiba o dicionario ordenado pelo modelo");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares3);

        System.out.println("Apague o conjunto de carros: ");
        carrosPopulares3.clear();

        System.out.println(carrosPopulares3);
        System.out.println("Verifica se a lista estar vazia: " + carrosPopulares3.isEmpty());

    }
}
