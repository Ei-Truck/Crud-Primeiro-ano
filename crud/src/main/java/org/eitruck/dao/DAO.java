package org.eitruck.dao;

import org.eitruck.config.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DAO {
    protected final Conexao conexao = new Conexao();
    protected Connection conn;

    public DAO() {
        this.conn = conexao.conectar();
        if (conn == null) {
            throw new RuntimeException();
        }
    }
}
