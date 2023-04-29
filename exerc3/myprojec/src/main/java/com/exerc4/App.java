package com.exerc4;

import java.util.Scanner;
import com.exerc4.Calculo.Calculo;

public class App {
    public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de conversão de Fahrenheit para centígrados : ");
        System.out.println("Informe o valor em Fahrenheit");
        temp = sc.nextDouble();
        Calculo calculo = new Calculo(temp);
        System.out.println("o valor de " + temp + "°F" + " " + "é" + " " + Math.round(calculo.celsius()) + "°C");
        sc.close();
    }
}
