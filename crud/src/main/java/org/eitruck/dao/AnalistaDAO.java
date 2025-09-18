package org.eitruck.dao;

import org.eitruck.model.Analista;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnalistaDAO {
    private Connection connection;

    public AnalistaDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void inserir(Analista obj) throws SQLException {
        // Ajuste os campos conforme o banco de dados
        String sql = "INSERT INTO analista VALUES (...)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos do objeto para stmt.setXXX
        }
    }

    // READ - buscar por id
    public Analista buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM analista WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // TODO: mapear ResultSet -> objeto Analista
                return new Analista(/* atributos */);
            }
        }
        return null;
    }

    // READ - listar todos
    public List<Analista> listarTodos() throws SQLException {
        List<Analista> lista = new ArrayList<>();
        String sql = "SELECT * FROM analista";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // TODO: mapear ResultSet -> objeto Analista
                Analista obj = new Analista(/* atributos */);
                lista.add(obj);
            }
        }
        return lista;
    }

    // UPDATE
    public void atualizar(Analista obj) throws SQLException {
        String sql = "UPDATE analista SET ... WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM analista WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
