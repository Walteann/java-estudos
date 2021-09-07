package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ExercicioList1 {
    public static void main(String[] args) {
        Mes mes = new Mes();
        List<Double> temperaturas = new ArrayList<>(){{
            add(10.0);
            add(20.0);
            add(15.5);
            add(31.1);
            add(29.2);
            add(23.1);
        }};

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {

            soma += iterator.next();
        }

//        MEDIA
        Double media = soma / temperaturas.size();
        Iterator<Double> iterator2 = temperaturas.iterator();
        System.out.println("Media: " + media);
        while(iterator2.hasNext()) {
            Double temp = iterator2.next();
            if (temp > media) {
                System.out.println(temp +" - " + mes.retornarMes(temperaturas.indexOf(temp) + 1));
            }
        }

    }

    public static String retornarMes(Integer indiceMes) {
        String mes = "";
        switch(indiceMes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Marco";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
        }

        return mes;
    }


}

class Mes {
    public String retornarMes(Integer indiceMes) {
        String mes = "";
        switch(indiceMes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Marco";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
        }

        return mes;
    }
}
