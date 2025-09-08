package model;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Telefone {
    //atributos
    private int id;
    private int ddi;
    private int ddd;
    private int numero;
    private int id_analista;
    private int id_transportadora;

    //método construtor
    public Telefone(int id, int ddi, int ddd, int numero, int id_analista, int id_transportadora) {
        this.id = id;
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.id_analista = id_analista;
        this.id_transportadora = id_transportadora;
    }

    //getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getDdi() {
        return ddi;
    }
    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public int getDdd() {
        return ddd;
    }
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId_analista() {
        return id_analista;
    }
    public void setId_analista(int id_analista) {
        this.id_analista = id_analista;
    }

    public int getId_transportadora() {
        return id_transportadora;
    }
    public void setId_transportadora(int id_transportadora) {
        this.id_transportadora = id_transportadora;
    }

    //toString
    public String toString() {
        return String.format("""
            Telefone:
                Id = %d
                DDI = %d
                DDD = %d
                Numero = %d
                ID Analista = %d
                ID Transportadora = %d""", this.id, this.ddi, this.ddd, this.numero, this.id_analista, this.id_transportadora);
    }
}