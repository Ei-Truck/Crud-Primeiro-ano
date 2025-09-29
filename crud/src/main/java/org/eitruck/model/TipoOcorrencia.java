package org.eitruck.model;

import org.eitruck.util.Uteis;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class TipoOcorrencia {
    //atributos
    private int id;
    private String tipo_evento;
    private int gravidade;

    //método construtor
    public TipoOcorrencia(int id, String tipo_evento, int gravidade) {
        setId(id);
        this.tipo_evento = tipo_evento;
        setGravidade(gravidade);
    }

    //getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = Uteis.validarId(id);
    }

    public String getTipo_evento() {
        return tipo_evento;
    }
    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public int getGravidade() {
        return gravidade;
    }
    public void setGravidade(int gravidade) {
        this.gravidade = Uteis.validarGravidade(gravidade);
    }

    //toString
    public String toString() {
        return String.format("""
            Tipo de Ocorrencia:
                Id = %d
                Tipo de Evento = %s
                Gravidade = %d""", this.id, this.tipo_evento, this.gravidade);
    }
}