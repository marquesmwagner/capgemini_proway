package com.questoes.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {

        int tamanhoLista = 0;
        List<Integer> listaImpar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (tamanhoLista % 2 == 0) {
            System.out.println("Entre com um tamanho inteiro ímpar, para definir o " +
                    "tamanho de uma lista : ");
            tamanhoLista = sc.nextInt();
        }
        for (int i = 0; i < tamanhoLista; ++i) {
            System.out.println("Digite o próximo elemento da lista: ");
            listaImpar.add(sc.nextInt());
        }

        System.out.println("Mediana: " + mediana(listaImpar, tamanhoLista));

    }

    public static int mediana(List<Integer> lista, int tamanho) {
        Collections.sort(lista);
        int mediana = (tamanho + 1) / 2;

        return lista.get(mediana - 1);

    }
}
