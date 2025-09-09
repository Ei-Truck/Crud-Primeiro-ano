package org.eitruck.model;
public class Transportadora{
    // ATRIBUTOS
    private int id;
    private String cnpj;
    private String nome;
    private String email;
    public Transportadora(int id, String cnpj, String nome, String email){
        this.id=id;
        this.cnpj=cnpj;
        this.nome=nome;
        this.email=email;
    }
    //GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // TO STRING
}