package org.eitruck.model;

//============================TABELA EM REVISÃO==============================
//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Transportadora {
    //atributos
    private int id;
    private String cnpj;
    private String nome;
    private String email;

    //método construtor
    public Transportadora(int id, String cnpj, String nome, String email) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
    }

    //getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        this.email = email;
    }

    //toString
    public String toString() {
        return String.format("""
            Transportadora:
                Id = %d
                CNPJ = %s
                Nome = %s
                Email = %s""", this.id, this.cnpj, this.nome, this.email);
    }
}