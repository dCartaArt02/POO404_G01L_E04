package sv.edu.udb.datos;

import sv.edu.udb.util.conexion;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
public class OcupacionesDatos {
    private final String SQL_SELECT = "SELECT id_ocupacion,ocupacion FROM ocupaciones ORDER BY id_ocupacion";
    private final String SQL_SELECT_IDOCUPACION = "SELECT id_ocupacion FROM ocupaciones where ocupacion =?";

    public DefaultComboBoxModel selectOcupaciones()
    {
        DefaultComboBoxModel dtm = new DefaultComboBoxModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try
        {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                dtm.addElement(rs.getObject(2));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            conexion.close(rs);
            conexion.close(stmt);
            conexion.close(conn);
        }
        return dtm;
    }
    public int getIdOcupacion(String ocupacion)
    {
        int idOcupacion = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        System.out.println("Ocupacion "+ocupacion);
        System.out.println("Ocupacion "+SQL_SELECT_IDOCUPACION);
        try
        {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_IDOCUPACION);
            stmt.setString(1, ocupacion);
            rs = stmt.executeQuery();
            while(rs.next())
            {
                idOcupacion = rs.getInt(1);
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            conexion.close(rs);
            conexion.close(stmt);
            conexion.close(conn);
        }
        return  idOcupacion;
    }

}
