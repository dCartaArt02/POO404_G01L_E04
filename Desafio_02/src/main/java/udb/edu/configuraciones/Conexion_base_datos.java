package udb.edu.configuraciones;

import java.sql.*;


public class Conexion_base_datos {

     String driver = "com.mysql.jdbc.Driver";
     String url = "jdbc:mysql://localhost:3306/rapigo";
     String usuario = "root";
   String password = "Carta.345617";

    public Connection conectar()
    {

        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection cx = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión Exitosa");

        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
        return conectar();
    }
    public static void main(String[]args)
    {
        Conexion_base_datos a = new Conexion_base_datos();
        a.conectar();
    }

}



