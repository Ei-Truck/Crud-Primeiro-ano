package org.eitruck.model;

import java.util.List;

public class Unidade {
    // ATRIBUTOS
    private int id;
    private String nome;
    private int id_segmento;
    private int id_endereco;
    // CONSTRUTOR
    public Unidade(int id, String nome, int id_segmento, int id_endereco){
        this.id=id;
        this.nome=nome;
        this.id_segmento=id_segmento;
        this.id_endereco=id_endereco;
    }
    // GETTER E SETTER
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getId_segmento() {
        return id_segmento;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }
    // TOSTRING
}
