package com.conviq;

import java.util.ArrayList;
import java.util.List;

public class Transcricao {
    private String texto;
    private List<Sinal> sinais;

    public Transcricao(String texto) {
        this.texto = texto;
        this.sinais = new ArrayList<>();
    }

    public String getTexto() {
        return texto;
    }

    public void adicionarSinal(Sinal sinal) {
        sinais.add(sinal);
    }

    public List<Sinal> getSinais() {
        return sinais;
    }
}