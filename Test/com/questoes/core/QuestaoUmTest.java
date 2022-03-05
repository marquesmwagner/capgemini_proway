package com.questoes.core;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoUmTest {
    @Test
    void mediana1() {
        QuestaoUm test = new QuestaoUm();
        List<Integer> lista = Arrays.asList(9, 2, 1, 4, 6);
        int tamanho = lista.size();
        int output = test.mediana(lista, tamanho);
        assertEquals(4, output);

    }

    @Test
    void mediana2() {
        QuestaoUm test = new QuestaoUm();
        List<Integer> lista = Arrays.asList(3, 2, 1, 7, 6, 5, 9);
        int tamanho = lista.size();
        int output = test.mediana(lista, tamanho);
        assertEquals(5, output);

    }
}