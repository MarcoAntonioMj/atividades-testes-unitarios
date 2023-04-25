package com.marco.myproject;

import java.util.Scanner;
import com.marco.myproject.Calculo.Calculo;
public class App
{
	public static void main(String[] args) {
	    double numero1, numero2;
	    Scanner sc = new Scanner(System.in);
     try {
		System.out.print("Olá digite o primeiro numero : ");
		numero1 = sc.nextDouble();
		System.out.print("Olá digite o segundo numero : ");
		numero2 = sc.nextDouble();
		}catch (Exception e) {
			System.out.println("Erro: digite apenas números válidos!");
			return;
		} finally {
			sc.close();
		}
		Calculo calculo = new Calculo( numero1, numero2);
        System.out.print("A sua média foi de: " + calculo.media());
     sc.close();
	}
}

