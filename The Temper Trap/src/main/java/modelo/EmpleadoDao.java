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
    public Empleado validar(String nombre, String id) {
        Empleado Em = new Empleado();
        String sql = "select * from empleado where Nombre = ? and EmpleadoID = ?";
        try{
            cx=con.Conectar();
            stmt=con.Conectar().prepareStatement(sql);
            stmt.setString(2,nombre);
            stmt.setString(1,id);
            rs=stmt.executeQuery();
            while(rs.next()){
                Em.setId(rs.getInt("EmpleadoID"));
                Em.setNombre(rs.getString("Nombre"));
                Em.setCorreo(rs.getString("Correo"));
                Em.setPuesto(rs.getString("Cargo"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Em;
    }
}
