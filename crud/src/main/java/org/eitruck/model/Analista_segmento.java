package model;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Analista_segmento {
    //atributos
    private int id;
    private int id_Analista;
    private int id_segmento;
    private String cargo;

    //método construtor
    public Analista_segmento(int id, int id_Analista, int id_segmento, String cargo) {
        this.id = id;
        this.id_Analista = id_Analista;
        this.id_segmento = id_segmento;
        this.cargo = cargo;
    }

    //getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId_Analista() {
        return id_Analista;
    }
    public void setId_Analista(int id_Analista) {
        this.id_Analista = id_Analista;
    }

    public int getId_segmento() {
        return id_segmento;
    }
    public void setId_segmento(int id_segmento) {
        this.id_segmento = id_segmento;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //toString
    public String toString() {
        return String.format("""
            Analista_segmento:
                Id = %d
                ID Analista = %d
                ID Segmento = %d
                Cargo = %s""", this.id, this.id_Analista, this.id_segmento, this.cargo);
    }
}