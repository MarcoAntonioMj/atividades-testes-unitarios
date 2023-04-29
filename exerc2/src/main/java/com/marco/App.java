package com.marco;
import java.util.Scanner;

import com.marco.validador.Validador;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cpf;
        String nome;
        int idade;

        try {
            System.out.print("Olá, digite seu CPF: ");
            cpf = sc.nextLine();
            Validador.validaCPF(cpf);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        } finally {
            if (sc.ioException() == null) {
                sc.close();
            }
        }

        try {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            Validador.validaNome(nome);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        } finally {
            if (sc.ioException() == null) {
                sc.close();
            }
        }

        System.out.print("Digite sua idade: ");
        String input = sc.next();
        try {
            double idadeDouble = Double.parseDouble(input);
            Validador.validaIdade(idadeDouble);
            idade = (int) idadeDouble;
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada inválida para a idade, por favor insira um número.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        } finally {
            if (sc.ioException() == null) {
                sc.close();
            }
        }

        Validador validador = new Validador(cpf, idade, nome);
        String cpfValido = validador.getCpf();
        int idadeValida = validador.getIdade();
        String nomeValido = validador.getNome();

        System.out.println("Seu CPF é " + cpfValido);
        System.out.println("Sua idade é " + idadeValida + " Anos");
        System.out.println("Seu nome é " + nomeValido);
    }
}

