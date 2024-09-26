package modelo;
import java.sql.*;

public class Conexion_db {
    String driver = "com.mysql.cj.jdbc.Driver";

    public Connection Conectar() {
        String url = "jdbc:mysql://localhost:3306/rapigo";
        String user = "root";
        String pass = "Carta.345617";
        Connection conectar = null;

        try {
            // Cargar el driver manualmente
            Class.forName(driver);  // Este paso carga el driver en memoria

            // Intentar la conexión
            conectar = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado con éxito");

        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver MySQL");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
            e.printStackTrace();
        }
        return conectar;
    }

    public static void main(String[] args) {
        Conexion_db obj = new Conexion_db();
        obj.Conectar();
    }
}
