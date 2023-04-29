package com.exerc4.Calculo;

public class Calculo {
    private double temp;
    private double tempc;

    public Calculo(double temp) {
        this.temp = temp;
    }

    public double celsius() {
        tempc = (temp - 32) / 1.8;
        return tempc;
    }

}
