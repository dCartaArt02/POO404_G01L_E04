import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String url = "jdbc:sqlserver://localhost:1434;databaseName=rapigo;encrypt=true;trustServerCertificate=true";

    private String usuario = "sa";
    private String password = "123456";

    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try {
            // Conectarse a SQL Server usando el driver JDBC
            Connection cx = DriverManager.getConnection(conexion.url, conexion.usuario, conexion.password);
            System.out.println("Conexión Exitosa a SQL Server");

        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }
    }
}




