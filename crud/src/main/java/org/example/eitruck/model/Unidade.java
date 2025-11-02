package org.example.eitruck.model;

public class Unidade {
    // Atributos
    private int id;
    private String nome;
    private int idSegmento;
    private int idEndereco;

    // Métodos construtores
    public Unidade(int id, int idSegmento, int idEndereco, String nome) {
        this.id = id;
        this.idSegmento = idSegmento;
        this.idEndereco = idEndereco;
        this.nome = nome;
    }
    public Unidade(int idSegmento, int idEndereco, String nome) {
        this.nome = nome;
        this.idSegmento = idSegmento;
        this.idEndereco = idEndereco;
    }

    // Getters e setters
    // Campo ID
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Campo nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nomeCompleto) {
        this.nome = nomeCompleto;
    }

    // Campo ID do segmento
    public int getIdSegmento() {
        return this.idSegmento;
    }
    public void setIdSegmento(int idSegmento) {
        this.idSegmento = idSegmento;
    }

    // Campo ID do endereço
    public int getIdEndereco() {
        return this.idEndereco;
    }
    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    // Método toString
    @Override
    public String toString() {
        return String.format("""
            Unidade:
                Id = %d
                Nome = %s
                ID Segmento = %d
                ID Endereco = %d""",
                this.id, this.nome, this.idSegmento, this.idEndereco);
    }
}
