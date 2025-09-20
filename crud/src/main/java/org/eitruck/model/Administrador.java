package org.eitruck.model;

//Obs.: conversar com o Modolo sobre se a lógica de getters e setters é igual nos models
//ATENÇÃO, REVISAR O USO DE GET E DO TOSTRING NO CASO DE SENHAS (MANTER POR ENQUANTO)
public class Administrador {
    // atributos
    private int id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;

    // método construtor
    public Administrador(int id, String cpf, String nome, String email, String senha) {
        this.id = id;
        setCpf(cpf);       // validação aplicada
        this.nome = nome;
        setEmail(email);   // validação aplicada
        setSenha(senha);   // validação aplicada
    }

    // getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        // regex para aceitar somente 11 dígitos numéricos (com ou sem pontos/hífen)
        if (!cpf.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
        // remove pontos e hífen
        String numeros = cpf.replaceAll("\\D", "");
        // verifica se todos os dígitos são iguais ou termina em 00
        if (numeros.chars().distinct().count() == 1 || numeros.endsWith("00")) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        // regex para validar email
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        // regex para aceitar no mínimo 8 caracteres, pelo menos 1 letra e 1 número
        if (!senha.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")) {
            throw new IllegalArgumentException("Senha inválida. Deve ter no mínimo 8 caracteres, contendo letras e números.");
        }
        this.senha = senha;
    }

    // toString
    @Override
    public String toString() {
        return String.format("""
            Administrador:
                Id = %d
                Nome = %s
                Email = %s
                Senha = %s""", this.id, this.nome, this.email, this.senha);
    }
}
