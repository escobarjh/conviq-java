package com.conviq;

public class SinalChurn extends Sinal {

    public SinalChurn(String trecho) {
        super("Churn", trecho);
    }

    @Override
    public void exibirSinal() {
        System.out.println("⚠️ Risco de churn detectado: " + trecho);
    }
}