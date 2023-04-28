package com.marco;

import org.junit.jupiter.api.Test;

import com.marco.CalculodeJuros.Juros;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testValoralterado() {
        Juros juros = new Juros(500);
        double expectedValor = 550;
        Assertions.assertEquals(expectedValor, juros.valorAlterado());
    }
}
