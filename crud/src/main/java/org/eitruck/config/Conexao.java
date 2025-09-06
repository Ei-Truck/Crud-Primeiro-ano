package org.eitruck.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class Conexao {
    //atributo
    Connection conn;

    //carrega o .env
    Dotenv dotenv = Dotenv.load();

    //variáveis do .env
    String hostBd = dotenv.get("HOST_BD");
    String nomeBd = dotenv.get("NOME_BD");
    String usuarioBd = dotenv.get("USUARIO_BD");
    String portaBd = dotenv.get("PORTA_BD");
    String senhaBd = dotenv.get("SENHA_BD");

    //método para conectar o código com o banco de dados
    public Connection conectar() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://" + hostBd + ":" + portaBd + "/" + nomeBd, usuarioBd, senhaBd);
            return conn;
        }
        catch (SQLException sqle) {
            System.out.println("Exceção SQL identificada: ");
            sqle.printStackTrace();
        }
        return conn;
    }

    //método para desconectar o código com o banco de dados
    public boolean desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                return true;
            }
        }
        catch (SQLException sqle) {
            System.out.println("Exceção identificada ao desconectar o Banco de Dados");
            sqle.printStackTrace();
        }
        return false;
    }
}
