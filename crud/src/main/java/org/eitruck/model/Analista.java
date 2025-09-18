package org.eitruck.model;

import java.time.LocalDate;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Analista {
    //atributos
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String cargo;
    private String telefone;
    private LocalDate dt_contratacao;

    //método construtor
    public Analista(int id, String nome, String cpf, String email, String senha, String cargo, String telefone, LocalDate dt_contratacao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
        this.telefone = telefone;
        this.dt_contratacao = dt_contratacao;
    }

    //getters e setters
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
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
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
        this.telefone = telefone;
    }

    public LocalDate getDt_contratacao() {
        return dt_contratacao;
    }
    public void setDt_contratacao(LocalDate dt_contratacao) {
        this.dt_contratacao = dt_contratacao;
    }

    //toString
    public String toString() {
        return String.format("""
            Analista:
                Id = %d
                Nome = %s
                CPF = %s
                Email = %s
                Cargo = %s
                Telefone = %s
                Data de Contratação = %s""", this.id, this.nome, this.cpf, this.email, this.cargo, this.telefone, this.dt_contratacao);
    }
}