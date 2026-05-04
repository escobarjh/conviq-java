package com.conviq;

import java.util.ArrayList;
import java.util.List;

public class Reuniao {
    private int id;
    private String data;
    private String tipo;

    private List<Participante> participantes;
    private Transcricao transcricao;

    public Reuniao(int id, String data, String tipo) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante p) {
        participantes.add(p);
    }

    public void setTranscricao(Transcricao transcricao) {
        this.transcricao = transcricao;
    }

    public Transcricao getTranscricao() {
        return transcricao;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}

