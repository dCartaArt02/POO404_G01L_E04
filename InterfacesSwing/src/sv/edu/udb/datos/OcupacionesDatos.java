package sv.edu.udb.datos;

import sv.edu.udb.util.Conexion;

import javax.swing.*;
import java.sql.*;
public class OcupacionesDatos {
    private final String SQL_SELECT  = "SELECT id_ocupacion,ocupacion FROM ocupaciones ORDER BYid_ocupacion";
    private final String SQL_SELECT_IDOCUPACION = "SELECT id_ocupacion FROM ocupaciones where ocupacion =?";
    public DefaultComboBoxModel selectOcupaciones(){
        DefaultComboBoxModel dtm = new DefaultComboBoxModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
//Creando las filas para el JTable
            while (rs.next()) {
                dtm.addElement(rs.getObject(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return dtm;
    }
    public int getIdOcupacion(String ocupacion){
        int idOcupacion = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        System.out.println("ocupacion " + ocupacion);
        System.out.println("ocupacion " + SQL_SELECT_IDOCUPACION);
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_IDOCUPACION);
            stmt.setString(1, ocupacion);
            rs = stmt.executeQuery();
//Creando las filas para el JTable
            while (rs.next()) {
                idOcupacion = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return idOcupacion;
    }
}