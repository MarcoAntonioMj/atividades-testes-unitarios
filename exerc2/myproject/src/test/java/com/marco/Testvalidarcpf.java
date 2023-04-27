package com.marco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.marco.validador.Validador;

/**
 * Unit test for simple App.
 */
class Testvalidarcpf {
    /**
     * Rigorous Test.
     */
    @Test
    void testCpf_mais_de_11_numeros() {
        String cpfinvalido = "111222333445";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Validador.validaCPF(cpfinvalido);       
        });
    }

    @Test
    void testCpf_caracteresespeciais() {
        String cpfinvalido = "/*-+";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Validador.validaCPF(cpfinvalido);       
        });
    }
    @Test
    void testCpf_entradaComString() {
        String cpfinvalido = "ABC" ;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Validador.validaCPF(cpfinvalido);       
        });
    }
    @Test
    void testCpf_menos_de_11_numeros() {
        String cpfinvalido = "1112223334" ;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Validador.validaCPF(cpfinvalido);       
        });
    }
}