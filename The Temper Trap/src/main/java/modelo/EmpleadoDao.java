package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoDao {
    Conexion_db con = new Conexion_db();
    Connection cx;
    PreparedStatement stmt;
    ResultSet rs;
    public boolean validar (String usuario, String contraseña) {
        Empleado Em = new Empleado();
        String sql = "select * from empleado where User = ? and contraseña = ?";
        try{
            cx=con.Conectar();
            stmt=con.Conectar().prepareStatement(sql);
            stmt.setString(1, usuario );
            stmt.setString(2,contraseña);
            rs=stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
