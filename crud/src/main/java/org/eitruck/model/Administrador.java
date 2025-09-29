package org.eitruck.model;

import org.eitruck.util.Uteis;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Administrador {
    // atributos
    private int id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;

    // método construtor
    public Administrador(int id, String cpf, String nome, String email, String senha) {
        setId(id);
        setCpf(cpf);
        this.nome = nome;
        setEmail(email);
        setSenha(senha);
    }

    // getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = Uteis.validarId(id);
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = Uteis.validarCpf(cpf);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
        this.senha = Uteis.validarSenha(senha);
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
            Administrador:
                Id = %d
                Nome = %s
                Email = %s
                Senha = %s""", this.id, this.nome, this.email, this.senha);
    }
}
