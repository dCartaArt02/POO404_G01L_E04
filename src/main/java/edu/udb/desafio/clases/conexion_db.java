package edu.udb.desafio.clases;
import java.sql.*;
public class conexion_db {
    // String driver = "com.mysql.jdbc.Driver";


    public static Connection Conectar()
    {
        String url = "jdbc:mysql://localhost:3306/rapigo";
        String user = "root";
        String pass = "Carta.345617";
        Connection Conectar ;
        try {
            Conectar = DriverManager.getConnection(url,user,pass);
            System.out.println("Conectado con sucesso");
        } catch (SQLException e) {
            System.out.println("Erro no conectar");
            throw new RuntimeException(e);
        }
        return Conectar;
    }
    public static void main(String[]args)
    {
        Connection Conectar = Conectar();
    }

}
