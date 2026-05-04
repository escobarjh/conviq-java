package com.conviq;

import java.util.ArrayList;
import java.util.List;

public class AnalisadorTexto {

    public static void analisar(Transcricao transcricao) {

        String texto = transcricao.getTexto().toLowerCase();

        if (texto.contains("cancelar") || texto.contains("concorrente")) {
            transcricao.adicionarSinal(new SinalChurn("Risco de churn detectado"));
        }

        if (texto.contains("comprar") || texto.contains("interesse")) {
            transcricao.adicionarSinal(new SinalOportunidade("Oportunidade detectada"));
        }
    }

    public static void gerarInsight(Transcricao transcricao) {

        if (transcricao.getSinais().isEmpty()) {
            System.out.println("Nenhum insight relevante.");
        } else {
            for (Sinal s : transcricao.getSinais()) {
                s.exibirSinal();
            }
        }
    }
}