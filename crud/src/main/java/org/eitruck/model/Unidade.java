package org.eitruck.model;

import org.eitruck.util.Uteis;

public class Unidade {
    // atributos
    private int id;
    private String nome;
    private int id_segmento;
    private int id_endereco;

    // construtor
    public Unidade(int id, String nome, int id_segmento, int id_endereco) {
        setId(id);
        this.nome = nome;
        setId_segmento(id_segmento);
        setId_endereco(id_endereco);
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

    public int getId_segmento() {
        return id_segmento;
    }
    public void setId_segmento(int id_segmento) {
        this.id_segmento = Uteis.validarId(id_segmento);
    }

    public int getId_endereco() {
        return id_endereco;
    }
    public void setId_endereco(int id_endereco) {
        this.id_endereco = Uteis.validarId(id_endereco);
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
            Unidade:
                Id = %d
                Nome = %s
                ID Segmento = %d
                ID Endereco = %d""",
            this.id, this.nome, this.id_segmento, this.id_endereco);
    }
}