package org.eitruck.model;

import java.time.LocalDate;
import org.eitruck.util.Uteis;

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
        setId(id);
        this.nome = nome;
        setCpf(cpf);
        setEmail(email);
        setSenha(senha);
        this.cargo = cargo;
        setTelefone(telefone);
        this.dt_contratacao = dt_contratacao;
    }

    // getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = Uteis.validarId(id);
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
        this.cpf = Uteis.validarCpf(cpf);
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = Uteis.validarEmail(email);
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = validarSenha(senha);
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
        this.telefone = Uteis.validarTelefone(telefone);
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