package org.eitruck.dao;

import org.eitruck.model.Administrador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdministradorDAO {
    private Connection connection;

    public AdministradorDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void inserir(Administrador obj) throws SQLException {
        // Ajuste os campos conforme o banco de dados
        String sql = "INSERT INTO administrador VALUES (...)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos do objeto para stmt.setXXX
        }
    }

    // READ - buscar por id
    public Administrador buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM administrador WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // TODO: mapear ResultSet -> objeto Administrador
                return new Administrador(/* atributos */);
            }
        }
        return null;
    }

    // READ - listar todos
    public List<Administrador> listarTodos() throws SQLException {
        List<Administrador> lista = new ArrayList<>();
        String sql = "SELECT * FROM administrador";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // TODO: mapear ResultSet -> objeto Administrador
                Administrador obj = new Administrador(/* atributos */);
                lista.add(obj);
            }
        }
        return lista;
    }

    // UPDATE
    public void atualizar(Administrador obj) throws SQLException {
        String sql = "UPDATE administrador SET ... WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // TODO: mapear atributos
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void deletar(int id) throws SQLException {
        String sql = "DELETE FROM administrador WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
