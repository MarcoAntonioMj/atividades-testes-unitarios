package com.marco;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.marco.CalculodeJuros.Juros;

/**
 * Unit test for simple App.
 */
class TestedeExcecoes {

    @Test
    void testEntrada_String() {
        Scanner sc = new Scanner("abc");
        Assertions.assertThrows(InputMismatchException.class, () -> {
            double valorP = sc.nextDouble();
            Juros juros = new Juros(valorP);
            juros.valorAlterado();
        });
        sc.close();
    }

    @Test
    void testEntrada_Numeros_Negativos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Juros juros = new Juros(-500);
            juros.valorAlterado();
        });
    }
}