package org.eitruck.dao;

import org.eitruck.model.Endereco;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO {
    private Connection connection;

    public EnderecoDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void inserir(Endereco obj) throws SQLException {
        // Ajuste os campos conforme o banco de dados
        String sql = "INSERT INTO endereco VALUES (...)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos do objeto para stmt.setXXX
        }
    }

    // READ - buscar por id
    public Endereco buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM endereco WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // TODO: mapear ResultSet -> objeto Endereco
                return new Endereco(/* atributos */);
            }
        }
        return null;
    }

    // READ - listar todos
    public List<Endereco> listarTodos() throws SQLException {
        List<Endereco> lista = new ArrayList<>();
        String sql = "SELECT * FROM endereco";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // TODO: mapear ResultSet -> objeto Endereco
                Endereco obj = new Endereco(/* atributos */);
                lista.add(obj);
            }
        }
        return lista;
    }

    // UPDATE
    public void atualizar(Endereco obj) throws SQLException {
        String sql = "UPDATE endereco SET ... WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM endereco WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
