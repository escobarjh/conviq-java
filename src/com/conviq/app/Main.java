package com.conviq.app;

import com.conviq.service.AnalisadorTexto;
import com.conviq.model.Participante;
import com.conviq.model.Reuniao;
import com.conviq.model.Transcricao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONVIQ ===");

        Reuniao reuniao = new Reuniao(1, "04/05/2026", "Vendas");

        Participante p1 = new Participante("Carlos", "Gerente", "Empresa X");
        reuniao.adicionarParticipante(p1);

        System.out.println("Digite a transcrição:");
        String texto = sc.nextLine();

        Transcricao transcricao = new Transcricao(texto);
        reuniao.setTranscricao(transcricao);

        AnalisadorTexto.analisar(transcricao);

        System.out.println("\n=== INSIGHTS ===");
        transcricao.exibirResumo();

        sc.close();
    }
}