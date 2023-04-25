package com.marco.myproject;

import com.marco.myproject.Calculo.Calculo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.InputMismatchException;
import java.util.Scanner;

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

    @Test
    void testMediaNumeroLongos() {
        double numero1 = Double.MAX_VALUE - 1;
        double numero2 = Double.MAX_VALUE;
        Calculo calculo = new Calculo(numero1, numero2);
        double expectedMedia = Double.MAX_VALUE;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }

    @Test
    void testMediaNumeroPequenos() {
        double numero1 = Double.MIN_VALUE;
        double numero2 = Double.MIN_VALUE;
        Calculo calculo = new Calculo(numero1, numero2);
        double expectedMedia = 0.0;
        Assertions.assertEquals(expectedMedia, calculo.media(), 0.000001);
    }

    @Test
    void testNumerosDecimais() {
        Calculo calculo = new Calculo(0.5, 0.5);
        double expectedMedia = 0.5;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }

    @Test
    void testNumerosDecimaisDiferentes() {
        Calculo calculo = new Calculo(0.6, 0.5);
        double expectedMedia = 0.55;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }

    @Test
    void testNumerosDecimaisNegativos() {
        Calculo calculo = new Calculo(-0.6, -0.5);
        double expectedMedia = -0.55;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }

    @Test
    void testNumerosIguais() {
        Calculo calculo = new Calculo(5, 5);
        double expectedMedia = 5;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }
    @Test
    void testEntradaInvalida() {
    Scanner sc = new Scanner("abc");
    Assertions.assertThrows(InputMismatchException.class, () -> {
        double numero1 = sc.nextDouble();
        double numero2 = sc.nextDouble();
        Calculo calculo = new Calculo(numero1, numero2);
        calculo.media();
    });
    sc.close();
} 
}
