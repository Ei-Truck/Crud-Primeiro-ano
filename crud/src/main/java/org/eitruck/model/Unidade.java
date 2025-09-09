package org.eitruck.model;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Unidade {
    //atributos
    private int id;
    private String nome;
    private int id_segmento;
    private int id_endereco;

    //método construtor
    public Unidade(int id, String nome, int id_segmento, int id_endereco) {
        this.id = id;
        this.nome = nome;
        this.id_segmento = id_segmento;
        this.id_endereco = id_endereco;
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

    public int getId_segmento() {
        return id_segmento;
    }
    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public int getId_endereco() {
        return id_endereco;
    }
    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    //toString
    public String toString() {
        return String.format("""
            Unidade:
                Id = %d
                Nome = %s
                ID Segmento = %d
                ID Endereco = %d""", this.id, this.nome, this.id_segmento, this.id_endereco);
    }
}