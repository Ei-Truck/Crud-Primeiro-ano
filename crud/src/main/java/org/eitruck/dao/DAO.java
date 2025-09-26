package org.eitruck.dao;

import org.eitruck.config.Conexao;

import java.sql.Connection;

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
