package com.conviq;

public class SinalOportunidade extends Sinal {

    public SinalOportunidade(String trecho) {
        super("Oportunidade", trecho);
    }

    @Override
    public void exibirSinal() {
        System.out.println("💰 Oportunidade detectada: " + trecho);
    }
}
