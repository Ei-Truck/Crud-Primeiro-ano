package org.eitruck.dao;

import org.eitruck.model.Segmento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SegmentoDAO {
    private Connection connection;

    public SegmentoDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void inserir(Segmento obj) throws SQLException {
        // Ajuste os campos conforme o banco de dados
        String sql = "INSERT INTO segmento VALUES (...)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos do objeto para stmt.setXXX
        }
    }

    // READ - buscar por id
    public Segmento buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM segmento WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // TODO: mapear ResultSet -> objeto Segmento
                return new Segmento(/* atributos */);
            }
        }
        return null;
    }

    // READ - listar todos
    public List<Segmento> listarTodos() throws SQLException {
        List<Segmento> lista = new ArrayList<>();
        String sql = "SELECT * FROM segmento";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // TODO: mapear ResultSet -> objeto Segmento
                Segmento obj = new Segmento(/* atributos */);
                lista.add(obj);
            }
        }
        return lista;
    }

    // UPDATE
    public void atualizar(Segmento obj) throws SQLException {
        String sql = "UPDATE segmento SET ... WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM segmento WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
