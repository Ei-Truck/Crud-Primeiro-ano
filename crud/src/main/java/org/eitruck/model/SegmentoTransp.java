package org.eitruck.model;
public class SegmentoTransp{
    private int id;
    private int id_transportadora;
    private int id_segmento;
    private String status;
    private String observacoes;
    public SegmentoTransp(int id, int id_transportadora, int id_segmento, String status, String observacoes){
        this.id=id;
        this.id_transportadora=id_transportadora;
        this.id_segmento=id_segmento;
        this.status=status;
        this.observacoes=observacoes;
    }

    public int getId() {
        return id;
    }

    public int getId_transportadora() {
        return id_transportadora;
    }

    public int getId_segmento() {
        return id_segmento;
    }

    public String getStatus() {
        return status;
    }

    public String getObservacoes() {
        return observacoes;
    }
}