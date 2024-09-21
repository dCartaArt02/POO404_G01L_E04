package udb.edu.clases;
import udb.edu.configuraciones.Conexion_base_datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Producto_BD {
    Connection con;
    Conexion_base_datos cn = new Conexion_base_datos();
    PreparedStatement ps;
    ResultSet rs;

    public List listar ()
    {
        List <Producto_comida>menus = new ArrayList();
         String sql = "select * from menu";
         try {
             con = cn.conectar();
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
             while(rs.next())
             {
                Producto_comida P = new Producto_comida();
                P.setId(rs.getInt("1"));
                P.setNombre(rs.getString("2"));
                P.setDescripcion(rs.getString("3"));
                P.setPrecio(rs.getFloat("4"));
                P.setStock(rs.getInt("5"));
                P.setFoto(rs.getBinaryStream("6"));
                menus.add(P);

             }
         } catch (Exception e) {

         }
         return menus;
    }
}

