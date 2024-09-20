package udb.edu.configuraciones;

import java.sql.*;


public class Conexion {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/rapigo";
    private String usuario = "root";
    private String password = "Carta.345617";

    public static void main(String[]args)
    {
        Conexion a = new Conexion();
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection cx = DriverManager.getConnection(a.url ,a.usuario, a.password);
            System.out.println("Conexión Exitosa");

        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
}



