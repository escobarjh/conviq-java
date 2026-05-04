package com.conviq;

import java.util.List;
import java.util.Scanner;

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