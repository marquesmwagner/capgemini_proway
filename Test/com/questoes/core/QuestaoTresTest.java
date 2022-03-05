package com.questoes.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoTresTest {
    @Test
    void encriptar1() {
        QuestaoTres test = new QuestaoTres();
        String msg = "ola mundo";
        String output = QuestaoTres.encriptar(msg);
        assertEquals("omd luo an", output);

    }

    @Test
    void encriptar2() {
        QuestaoTres test = new QuestaoTres();
        String msg = "tenha um bom dia";
        String output = QuestaoTres.encriptar(msg);
        assertEquals("taoa eum nmd hbi", output);

    }
}