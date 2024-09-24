package modelo;
import java.sql.*;
public class Conexion_db {
    // String driver = "com.mysql.jdbc.Driver";


    public Connection Conectar()
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
        Conexion_db obj = new Conexion_db();
        obj.Conectar();
    }

}
