package com.marco.myproject.Calculo;

public class Calculo {
    private double numero1;
    private double numero2;
    
    public Calculo(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double media() {
        double soma = numero1 + numero2;
        if (Double.isInfinite(soma)) {
            // Soma ultrapassou o limite máximo, retorna o valor máximo possível
            System.out.println("O resultado da soma ultrapassou o limite máximo. Retornando o valor máximo possível.");
            return Double.MAX_VALUE;
        } else if (Double.isNaN(soma)) {
            // Soma é NaN, provavelmente devido a um valor NaN de entrada, retorna NaN
            return Double.NaN;
        } else if (soma == 0.0) {
            // Ambos os números são iguais a zero, retorna zero
            return 0.0;
        } else {
            return soma / 2.0;
        }
    }
}