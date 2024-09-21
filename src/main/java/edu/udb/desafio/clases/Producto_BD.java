package edu.udb.desafio.clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Producto_BD {
    Connection con;
    conexion_db db = new conexion_db();
    PreparedStatement ps;
    ResultSet rs;

    public List listar ()
    {
        List <Producto_comida>menus = new ArrayList();
         String sql = "select * from menu";
         try {

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
    public static void main(String[]args)
    {

    }
}

