package com.exerc4;

import com.exerc4.Calculo.Calculo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void test_Valor_Positivo() {
        Calculo calculo = new Calculo(32);
        double expected = -0;
        Assertions.assertEquals(expected, calculo.celsius());
    }

    @Test
    void test_Valor_Negativo() {
        Calculo calculo = new Calculo(-40);
        double expected = -40;
        Assertions.assertEquals(expected, calculo.celsius());
    }

    @Test
    void test_Valor_Aleatorio() {
        Calculo calculo = new Calculo(68);
        double expected = 20;
        Assertions.assertEquals(expected, calculo.celsius());
    }

    @Test

    void test_Valor_Aredondado() {
        Calculo calculo = new Calculo(20.5);
        int expected = -6;
        Assertions.assertEquals(expected, Math.round(calculo.celsius()));
    }
}
