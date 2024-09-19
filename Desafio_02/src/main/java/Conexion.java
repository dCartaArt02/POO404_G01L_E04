import java.sql.*;

public class Conexion {
    public class ConexionBaseDatos {
        private static final String URL = "jdbc:mysql://localhost:3306/";
        private static final String USER = "root";
        private static final String PASSWORD = "Carta.345617";
        private static final String DRIVER = "com.mysql.jdbc.Driver";
        private static final String DB_NAME = "rapigo";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);

        }
    }
    public static void main(String[] args) {
        
    }
}
