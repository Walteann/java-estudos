package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> perguntas = new ArrayList<>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vitima?");
        }};

        Scanner input = new Scanner(System.in);

        int   quantidadeRespostas = 0;

        Iterator iterador = perguntas.iterator();

        while(iterador.hasNext()) {
            System.out.println(iterador.next());
            String resposta = input.next();

            if (resposta.equalsIgnoreCase("sim")) {
                quantidadeRespostas++;
            }
        }

        if (quantidadeRespostas == 2) {
            System.out.println("Suspeito");
        } else if (quantidadeRespostas > 2 && quantidadeRespostas < 5) {
            System.out.println("Cúmplice");
        } else if (quantidadeRespostas > 4) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }

    }
}


class Pergunta {
    private String pergunta;

    Pergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return this.pergunta;
    }
}