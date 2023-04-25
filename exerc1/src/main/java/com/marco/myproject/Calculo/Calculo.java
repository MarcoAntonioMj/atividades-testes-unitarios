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
        return (numero1 + numero2) / 2;
    }
}