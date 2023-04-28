package com.marco;

import java.util.Scanner;

import com.marco.CalculodeJuros.Juros;

public class App {
    public static void main(String[] args) {
 Scanner leitor = new Scanner(System.in);
double valorP;

try {
    System.out.print("valor do produto: ");
    valorP = leitor.nextDouble();
    Juros juros = new Juros(valorP);
    System.out.println("O valor do produto com 10% de juros é: R$ " + juros.valorAlterado());
    } catch (IllegalArgumentException e) {
    System.out.println("Erro: " + e.getMessage());
    } catch (Exception e) {
    System.out.println("Erro: digite apenas números válidos! Em caso de numeros decimias adicione ponto em vez de virgula.");
    } finally {
    leitor.close();
   }
    }
}

