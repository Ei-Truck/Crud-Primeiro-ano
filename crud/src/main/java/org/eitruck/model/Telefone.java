package org.eitruck.model;
public class Telefone {
    private int id;
    private int ddi;
    private int ddd;
    private int numero;
    private int id_analista;
    private int id_transportadora;
    //private int id_motorista;
    public Telefone(int id, int ddi, int ddd, int numero, int id_analista, int id_transportadora){
        this.id=id;
        this.ddi=ddi;
        this.ddd=ddd;
        this.numero=numero;
        this.id_analista=id_analista;
        this.id_transportadora=id_transportadora;
    }
    public int getId() {
        return id;
    }

    public int getDdi() {
        return ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public int getNumero() {
        return numero;
    }

    public int getId_analista() {
        return id_analista;
    }

    public int getId_transportadora() {
        return id_transportadora;
    }



    public void setDdi(int ddi) {
        this.ddi = ddi;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setId_transportadora(int id_transportadora) {
        this.id_transportadora = id_transportadora;
    }
}