package com.conviq;

import java.util.ArrayList;
import java.util.List;

public class Transcricao {

    private String texto;
    private List<Sinal> sinais;
    private String sentimento;

    // Construtor
    public Transcricao(String texto) {
        this.texto = texto;
        this.sinais = new ArrayList<>();
        this.sentimento = "Neutro"; // evita null
    }

    // Getter do texto
    public String getTexto() {
        return texto;
    }

    // Adicionar sinal
    public void adicionarSinal(Sinal sinal) {
        sinais.add(sinal);
    }

    // Getter dos sinais
    public List<Sinal> getSinais() {
        return sinais;
    }

    // Setter do sentimento
    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }

    // Getter do sentimento
    public String getSentimento() {
        return sentimento;
    }

    // Método extra (diferencial)
    public void exibirResumo() {
        System.out.println("📄 Texto: " + texto);
        System.out.println("📊 Sentimento: " + sentimento);

        if (sinais.isEmpty()) {
            System.out.println("Nenhum sinal detectado.");
        } else {
            System.out.println("🔎 Sinais detectados:");
            for (Sinal s : sinais) {
                s.exibirSinal();
            }
        }
    }
}