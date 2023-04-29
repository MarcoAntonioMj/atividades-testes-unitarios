package com.marco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.marco.validador.Validador;

class Testevalidarnome {

    @Test
    void test_nomeEmBranco() {
        String nomeInvalido = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Validador.validaNome(nomeInvalido);       
        });
    }

    @Test
    void testnome_caracteresespeciais() {
        String nomeInvalido = "/*-+";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Validador.validaNome(nomeInvalido);       
        });
    }
    @Test
    void testnome_entradaComInt() {
        String nomeInvalido = "123" ;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        Validador.validaNome(nomeInvalido);       
        });
    }
    
}
