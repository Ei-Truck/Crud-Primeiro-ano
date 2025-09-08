package model;

public class Analista {
    // ATRIBUTOS
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String cargo;
    private String telefone;
    private Localdate dt_contratacao;
    // CONSTRUTOR

    public Analista(int id, String nome, String cpf, String email, String senha, String cargo, String telefone, Localdate dt_contratacao) {
        this.id = id;
        this.nome = nome;
        this.cpf=cpf;
        this.email = email;
        this.senha=senha;
        this.cargo = cargo;
        this.telefone=telefone;
        this.dt_contratacao=dt_contratacao;
    }
    // GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCargo() {
        return cargo;
    }

    public Localdate getDt_contratacao() {
        return dt_contratacao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // TOSTRING
    public String toString(){
        return "id: "+this.id+"\nnome: "+this.nome+"\nemail: "+this.email+"\ncargo: "+this.cargo+"\n data de contratação: "+this.dt_contratacao;
    }
}
