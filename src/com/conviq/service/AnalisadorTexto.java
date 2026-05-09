package com.conviq.service;

import com.conviq.domain.SinalChurn;
import com.conviq.domain.SinalOportunidade;
import com.conviq.model.Transcricao;

import java.util.Arrays;
import java.util.List;

public class AnalisadorTexto {

    // 🔹 Palavras-chave organizadas
    private static final List<String> palavrasChurn = Arrays.asList(
            "cancelar", "concorrente", "insatisfeito", "trocar"
    );

    private static final List<String> palavrasOportunidade = Arrays.asList(
            "comprar", "interesse", "upgrade", "adquirir"
    );

    private static final List<String> palavrasPositivas = Arrays.asList(
            "satisfeito", "bom", "ótimo", "excelente"
    );

    private static final List<String> palavrasNegativas = Arrays.asList(
            "ruim", "frustrado", "problema", "péssimo"
    );

    private static final List<String> produtos = Arrays.asList(
            "protheus", "rm", "fluig"
    );

    //  Método principal
    public static void analisar(Transcricao transcricao) {

        String texto = transcricao.getTexto().toLowerCase();

        detectarChurn(transcricao, texto);
        detectarOportunidade(transcricao, texto);
        detectarProduto(texto);
        detectarSentimento(transcricao, texto);
    }

    // 🔹 Métodos separados (mais organizado)

    private static void detectarChurn(Transcricao t, String texto) {
        for (String palavra : palavrasChurn) {
            if (texto.contains(palavra)) {
                t.adicionarSinal(new SinalChurn("Possível churn: " + palavra));
                break;
            }
        }
    }

    private static void detectarOportunidade(Transcricao t, String texto) {
        for (String palavra : palavrasOportunidade) {
            if (texto.contains(palavra)) {
                t.adicionarSinal(new SinalOportunidade("Oportunidade: " + palavra));
                break;
            }
        }
    }

    private static void detectarProduto(String texto) {
        for (String produto : produtos) {
            if (texto.contains(produto)) {
                System.out.println("📦 Produto detectado: " + produto);
            }
        }
    }

    private static void detectarSentimento(Transcricao t, String texto) {

        int positivos = 0;
        int negativos = 0;

        for (String p : palavrasPositivas) {
            if (texto.contains(p)) positivos++;
        }

        for (String n : palavrasNegativas) {
            if (texto.contains(n)) negativos++;
        }

        if (positivos > negativos) {
            t.setSentimento("Positivo");
        } else if (negativos > positivos) {
            t.setSentimento("Negativo");
        } else {
            t.setSentimento("Neutro");
        }
    }
}