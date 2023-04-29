package com.marco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.marco.CalculodeJuros.Juros;

/**
 * Unit test for simple App.
 */
class TestValorAlterado {
    /**
     * Rigorous Test.
     */
    @Test
    void testValoralteradoNumeroInt() {
        Juros juros = new Juros(500);
        double expectedValor = 550;
        Assertions.assertEquals(expectedValor, juros.valorAlterado());
    }
    @Test
    void testValoralteradoNumeroFracionado() {
        Juros juros = new Juros(100.50);
        double expectedValor = 110.55;
        Assertions.assertEquals(expectedValor, juros.valorAlterado());
    }
}
