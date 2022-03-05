package com.questoes.core;

import java.util.*;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a mensagem: ");
        String mensagem = sc.nextLine();

        System.out.println(encriptar(mensagem));

    }

    public static String encriptar(String mensagem) {

        mensagem = mensagem.replace(" ", "");

        int tamanho = mensagem.length();
        int raizQ = (int) Math.ceil(Math.sqrt(tamanho));
        int x = raizQ;

        if (raizQ * raizQ < tamanho) {
            ++x;
        }

        String mensagemEncriptada = "";
        for (int i = 0; i < raizQ; ++i) {
            for (int j = 0; j < x; ++j) {
                if (i + (j * x) < tamanho) {
                    mensagemEncriptada += mensagem.charAt(i + (j * x));
                }
            }
            mensagemEncriptada += " ";
        }
        return mensagemEncriptada.trim();
    }
}