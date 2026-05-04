package com.conviq;

public class ProdutoTotvs {
    private String nome;
    private String status; // atual ou oportunidade

    public ProdutoTotvs(String nome, String status) {
        this.nome = nome;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }
}