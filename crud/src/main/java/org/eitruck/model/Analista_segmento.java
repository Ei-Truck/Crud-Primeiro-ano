package org.eitruck.model;
public class Analista_segmento{
    private int id;
    private int id_Analista;
    private int id_segmento;
    private String cargo;
    public Analista_segmento(int id, int id_Analista, int id_segmento, String cargo){
        this.id=id;
        this.id_Analista=id_Analista;
        this.id_segmento=id_segmento;
        this.cargo=cargo;
    }

    public int getId() {
        return id;
    }

    public int getId_Analista() {
        return id_Analista;
    }

    public int getId_segmento() {
        return id_segmento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}