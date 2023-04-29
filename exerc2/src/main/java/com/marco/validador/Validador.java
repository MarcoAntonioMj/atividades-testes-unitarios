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

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public static void validaCPF(String cpf) throws IllegalArgumentException {
        if (cpf.length() != 11 || !cpf.matches("\\d+")) {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public static void validaIdade(double idade) throws IllegalArgumentException {
        if (!String.valueOf(idade).matches("\\d+(\\.\\d+)?")) {
            throw new IllegalArgumentException("Idade inválida");
        }
        int idadeInt = (int) Math.round(idade);
        double parteDecimal = idade - Math.floor(idade);
        if (idadeInt < 0 || idadeInt > 120 || idade != idadeInt || parteDecimal != 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
    }

    public static void validaNome(String nome) throws IllegalArgumentException {
        if (nome.isEmpty() || !nome.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Nome inválido");
        }
    }
}