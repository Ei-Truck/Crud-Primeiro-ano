package org.eitruck.dao;

import org.eitruck.model.Unidade;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UnidadeDAO {
    private Connection connection;

    public UnidadeDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void inserir(Unidade obj) throws SQLException {
        // Ajuste os campos conforme o banco de dados
        String sql = "INSERT INTO unidade VALUES (...)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos do objeto para stmt.setXXX
        }
    }

    // READ - buscar por id
    public Unidade buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM unidade WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // TODO: mapear ResultSet -> objeto Unidade
                return new Unidade(/* atributos */);
            }
        }
        return null;
    }

    // READ - listar todos
    public List<Unidade> listarTodos() throws SQLException {
        List<Unidade> lista = new ArrayList<>();
        String sql = "SELECT * FROM unidade";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // TODO: mapear ResultSet -> objeto Unidade
                Unidade obj = new Unidade(/* atributos */);
                lista.add(obj);
            }
        }
        return lista;
    }

    // UPDATE
    public void atualizar(Unidade obj) throws SQLException {
        String sql = "UPDATE unidade SET ... WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM unidade WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
