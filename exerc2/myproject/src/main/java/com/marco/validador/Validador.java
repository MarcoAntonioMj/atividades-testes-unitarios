package com.marco.validador;

public class Validador {
    private String cpf;
    private int idade;
    private String nome;

    public Validador(String cpf, int idade, String nome) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void validaCPF(String cpf) throws IllegalArgumentException {
        if (cpf.length() != 11 || !cpf.matches("\\d+")) {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public static void validaIdade(int idade) throws IllegalArgumentException {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida");
        }
    }

    public static void validaNome(String nome) throws IllegalArgumentException {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
    }
}