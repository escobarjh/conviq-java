package com.conviq;

public class Participante {
    private String nome;
    private String cargo;
    private String empresa;

    public Participante(String nome, String cargo, String empresa) {
        this.nome = nome;
        this.cargo = cargo;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmpresa() {
        return empresa;
    }
}
