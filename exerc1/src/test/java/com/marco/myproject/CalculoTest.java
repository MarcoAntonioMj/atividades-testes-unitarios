package com.marco.myproject;
import com.marco.myproject.Calculo.Calculo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



class CalculoTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testMediaInteirosPositivos() {
        Calculo calculo = new Calculo(4, 6);
        double expectedMedia = 5.0;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }
    @Test
    void testMediaInteirosNegativo() {
        Calculo calculo = new Calculo(-5, -5);
        double expectedMedia = -5.0;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }
    
}
