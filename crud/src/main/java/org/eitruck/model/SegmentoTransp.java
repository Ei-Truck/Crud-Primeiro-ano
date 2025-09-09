package org.eitruck.model;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class SegmentoTransp {
    //atributos
    private int id;
    private int id_transportadora;
    private int id_segmento;
    private String status;
    private String observacoes;

    //método construtor
    public SegmentoTransp(int id, int id_transportadora, int id_segmento, String status, String observacoes) {
        this.id = id;
        this.id_transportadora = id_transportadora;
        this.id_segmento = id_segmento;
        this.status = status;
        this.observacoes = observacoes;
    }

    //getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId_transportadora() {
        return id_transportadora;
    }
    public void setId_transportadora(int id_transportadora) {
        this.id_transportadora = id_transportadora;
    }

    public int getId_segmento() {
        return id_segmento;
    }
    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    //toString
    public String toString() {
        return String.format("""
            SegmentoTransporte:
                Id = %d
                ID Transportadora = %d
                ID Segmento = %d
                Status = %s
                Observacoes = %s""", this.id, this.id_transportadora, this.id_segmento, this.status, this.observacoes);
    }
}