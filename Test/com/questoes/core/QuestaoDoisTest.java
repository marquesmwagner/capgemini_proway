package com.questoes.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoDoisTest {
    @Test
    void diferenca1() {
        QuestaoDois test = new QuestaoDois();
        int[] arr = {1, 5, 3, 4, 2};
        int output = QuestaoDois.diferenca(arr, 2);
        assertEquals(3, output);

    }
    @Test
    void diferenca2() {
        QuestaoDois test = new QuestaoDois();
        int[] arr = {2, 7, 4, 5, 6, 9};
        int output = QuestaoDois.diferenca(arr, 2);
        assertEquals(4, output);

    }
}