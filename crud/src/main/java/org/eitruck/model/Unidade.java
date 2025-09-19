package org.eitruck.model;

public class Unidade {
    // atributos
    private int id;
    private String nome;
    private int id_segmento;
    private int id_endereco;

    // construtor
    public Unidade(int id, String nome, int id_segmento, int id_endereco) {
        this.id = id;
        this.nome = nome;
        setId_segmento(id_segmento);   // validação
        setId_endereco(id_endereco);   // validação
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

    public int getId_segmento() {
        return id_segmento;
    }
    public void setId_segmento(int id_segmento) {
        if (id_segmento <= 0) {
            throw new IllegalArgumentException("ID do segmento inválido. Deve ser positivo.");
        }
        this.id_segmento = id_segmento;
    }

    public int getId_endereco() {
        return id_endereco;
    }
    public void setId_endereco(int id_endereco) {
        if (id_endereco <= 0) {
            throw new IllegalArgumentException("ID do endereço inválido. Deve ser positivo.");
        }
        this.id_endereco = id_endereco;
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