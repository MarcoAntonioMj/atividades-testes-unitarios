package com.marco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.marco.validador.Validador;

public class Testevalidaridade {
    @Test
    void testIdade_menorQueZero() {
        int idade = -1;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validador.validaIdade(idade);
        });
    }
    
    @Test
    void testIdade_maiorQueCentoEVinte() {
        int idade = 121;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validador.validaIdade(idade);
        });
    }
    @Test
    void testIdade_caracteresespeciais() {
        String idadeInvalida = "/*-+";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validador.validaIdade(Integer.parseInt(idadeInvalida));
        });
    }
    @Test
    void testIdade_numerosFracionados() {
        double idadeInvalida = 19.5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validador.validaIdade(idadeInvalida);
        });
    }
    @Test
    void testidade_entradaComString() {
        String idadeInvalida = "ABC";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double idade = Double.parseDouble(idadeInvalida);
            Validador.validaIdade(idade);       
        });
    }
    
}


