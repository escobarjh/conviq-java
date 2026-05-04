package com.conviq;

public abstract class Sinal {
    protected String tipo;
    protected String trecho;

    public Sinal(String tipo, String trecho) {
        this.tipo = tipo;
        this.trecho = trecho;
    }

    public abstract void exibirSinal();
}