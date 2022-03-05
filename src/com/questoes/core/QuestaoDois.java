package com.questoes.core;

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {

        int tamanhoVetor;
        int diferenca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o tamanho do vetor: ");
        tamanhoVetor = sc.nextInt();

        int[] arr = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; ++i) {
            System.out.println("Entre com o próximo elemento do vetor: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entre com a diferença: ");
        diferenca = sc.nextInt();

        System.out.println("Há " + diferenca(arr, diferenca) + " pares com o a diferença requisitada.");

    }

    public static int diferenca(int[] arr, int x) {
        int resultado = 0;
        for (int i = 1; i < arr.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (Math.abs(arr[i] - arr[j]) == x) {
                    resultado++;
                }
            }
        }
        return resultado;

    }
}
