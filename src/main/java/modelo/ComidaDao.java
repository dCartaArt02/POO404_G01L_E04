package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Conexion_db;

public class ComidaDao {
    Connection con;
    Conexion_db Cx = new Conexion_db();
    PreparedStatement stmt;
    ResultSet rs;
    public List lista ()
    {
        List<Producto_comida>producto_comidas = new ArrayList<Producto_comida>();
        String sql = "select * from menu";
        try
        {
            con=Cx.Conectar();
            stmt=con.prepareStatement(sql);
            rs=stmt.executeQuery();
            while (rs.next())
            {
                Producto_comida p = new Producto_comida();
                p.setId(rs.getInt("1"));
                p.setNombre(rs.getString("2"));
                p.setDescripcion(rs.getString("3"));
                p.setPrecio(rs.getFloat("4"));
                producto_comidas.add(p);
            }

        }catch (SQLException e)
        {

        }finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return producto_comidas;
    }

}
