package org.eitruck.model;

import org.eitruck.util.Uteis;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Segmento {
    //atributos
    private int id;
    private String nomeCompleto;
    private String descricao;

    //método construtor
    public Segmento(int id, String nomeCompleto, String descricao) {
        setId(id);
        this.nomeCompleto = nomeCompleto;
        this.descricao = descricao;
    }

    //getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = Uteis.validarId(id);
    }

    public String getNome() {
        return nomeCompleto;
    }
    public void setNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //toString
    public String toString() {
        return String.format("""
            Segmento:
                Id = %d
                Nome = %s
                Descricao = %s""", this.id, this.nomeCompleto, this.descricao);
    }
}