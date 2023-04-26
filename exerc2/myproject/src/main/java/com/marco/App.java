package com.marco;
import java.util.Scanner;

import com.marco.validador.Validador;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        String cpf;
        String nome;
        
        try {
            System.out.print("Olá, digite seu CPF: ");
            cpf = sc.nextLine();
            Validador.validaCPF(cpf);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }
		
        try {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
            Validador.validaNome(nome);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }
        
        try {
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            Validador.validaIdade(idade);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }
        
        Validador validador = new Validador(cpf, idade, nome);
        String cpfValido = validador.getCpf();
        int idadeValida = validador.getIdade();
        String nomeValido = validador.getNome();
        
        System.out.println("Seu CPF é " + cpfValido);
        System.out.println("Sua idade é " + idadeValida);
        System.out.println("Seu nome é " + nomeValido);
        sc.close();
    }
}
