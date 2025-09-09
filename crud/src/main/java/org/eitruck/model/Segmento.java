package org.eitruck.model;

import java.util.List;

public class Segmento {
    // ATRIBUTOS
    private int id;
    private String nome;
    private String descricao;
    //CONSTRUTOR
    public Segmento(int id, String nome, String descricao){
        this.id=id;
        this.nome=nome;
        this.descricao=descricao;
    }
    // GETTER E SETTER

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    // TOSTRING
}
