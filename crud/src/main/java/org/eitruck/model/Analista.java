package org.eitruck.model;

import java.time.LocalDate;

public class Analista {
    // atributos
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String cargo;
    private String telefone;
    private LocalDate dt_contratacao;

    // construtor
    public Analista(int id, String nome, String cpf, String email, String senha, String cargo, String telefone, LocalDate dt_contratacao) {
        this.id = id;
        this.nome = nome;
        setCpf(cpf);         // validação
        setEmail(email);     // validação
        setSenha(senha);     // validação
        this.cargo = cargo;
        setTelefone(telefone); // validação
        this.dt_contratacao = dt_contratacao;
    }

    // getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        // regex para aceitar somente 11 dígitos numéricos (com ou sem pontos/hífen)
        if (!cpf.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
        // remove pontos e hífen
        String numeros = cpf.replaceAll("\\D", "");
        // verifica se todos os dígitos são iguais ou termina em 00
        if (numeros.chars().distinct().count() == 1 || numeros.endsWith("00")) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        if (!senha.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")) {
            throw new IllegalArgumentException("Senha inválida. Mínimo 8 caracteres, incluindo letras e números.");
        }
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        if (!telefone.matches("\\d{10,11}")) {
            throw new IllegalArgumentException("Telefone inválido. Deve conter 10 ou 11 dígitos.");
        }
        this.telefone = telefone;
    }

    public LocalDate getDt_contratacao() {
        return dt_contratacao;
    }
    public void setDt_contratacao(LocalDate dt_contratacao) {
        this.dt_contratacao = dt_contratacao;
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
            Analista:
                Id = %d
                Nome = %s
                CPF = %s
                Email = %s
                Cargo = %s
                Telefone = %s
                Data de Contratação = %s""",
                this.id, this.nome, this.cpf, this.email, this.cargo, this.telefone, this.dt_contratacao);
    }
}